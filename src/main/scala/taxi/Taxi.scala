package taxi

final case class Taxi(
                       dispatchers: List[Dispatcher],
                       drivers: List[Driver],
                       employees: List[Employee],
                       clients: List[Client],
                       program: Program,
                       tariff: Tariff
                     )
