# coding=utf-8
import flask_restful
from flask import Flask
from flask_cors import CORS
from flask_migrate import Migrate, MigrateCommand
from flask_script import Manager
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = environ['DATABASE_URL']
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = True

CORS(app)

#app.config.from_object('config')
db = SQLAlchemy(app)
migrate = Migrate(app, db)
manager = Manager(app)

manager.add_command('db', MigrateCommand)
errors = {
    'sqlalchemy.exc.IntegrityError': {
        'message': "A user with that username already exists.",
        'status': 409,
    },
    'ResourceDoesNotExist': {
        'message': "A resource with that ID no longer exists.",
        'status': 410,
        'extra': "Any extra information you want.",
    },
}
api = flask_restful.Api(app, errors=errors)

from app.main.models.Produto import Produto_dao
from app.main.controllers import Produto_controller
from app.main.service import Produto_service
from app.main.controllers import Compra_controller
from app.main.controllers import Unidade_medida_controller
from app.main.service import Compra_service
