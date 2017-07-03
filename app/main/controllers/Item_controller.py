# coding=utf-8
import json

from flask import jsonify,flash,redirect,url_for,render_template

from app import app
from app.main.service.Item_service import Item_service

service = Item_service()

@app.route("/item/list", options='GET')
def find_all():
    service.find_all()
    print("dumps",json.dumps(service.find_all()))
    return jsonify(service.find_all())

@app.route("/item/<id>", options='GET')
def find_by_id(id):
    service.find_by_id(id)
    return 'ok'

@app.route("/item/<id>", options='UPDATE')
def update(id):
    item = service.find_by_id(id)
    service.update(item)
    return 'ok'