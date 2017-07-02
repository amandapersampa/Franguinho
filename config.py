from os import environ
import os.path

basedir = os.path.abspath(os.path.dirname(__file__))
DEBUG = True
#SQLALCHEMY_DATABASE_URI = 'sqlite:///' + os.path.join(basedir, 'teste2.db')
SQLALCHEMY_DATABASE_URI = 'postgresql://postgres:1234@localhost:5432/teste'
#SQLALCHEMY_DATABASE_URI = 'postgres://nswipwilevulme:a757a727c60f7727f8cc7bcef81d3a520e9738c3156119c9dda45ffa6e55f615@ec2-50-19-219-69.compute-1.amazonaws.com:5432/da42m9h07pq542'
SQLALCHEMY_TRACK_MODIFICATIONS = True
SECRET_KEY = '1234'