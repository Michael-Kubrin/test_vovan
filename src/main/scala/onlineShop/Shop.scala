package onlineShop

case class Shop(
               customers: List[Customer],
               admins: List[Manager],
               items: List[Item],
               owners: List[FathersOfShop]
               )
