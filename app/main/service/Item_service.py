from app import Item

def find_all():
    return Item.find_all()

def find_by_id(id):
    return Item.find_by_id(id)

def update(id):
    item = Item.find_by_id(id)
    Item.update(item)