package onlineShop

case class Shop(
               customers: List[Customers],
               admins: List[Manager],
               items: List[Item],
               owners: List[FathersOfShop]
               )
