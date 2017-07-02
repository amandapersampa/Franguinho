from os import environ
import os.path

basedir = os.path.abspath(os.path.dirname(__file__))
DEBUG = True
WHOOSH_ENABLED = environ.get('HEROKU') is None
if WHOOSH_ENABLED:
    SQLALCHEMY_DATABASE_URI = 'postgresql://postgres:ifes@localhost:5432/teste'
    SECRET_KEY = '4321421342134321434'
else:
    SQLALCHEMY_DATABASE_URI = environ.get('DATABASE_URL')
SQLALCHEMY_TRACK_MODIFICATIONS = True
