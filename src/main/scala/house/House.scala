package house

final case class House(
                        residents: Residents,
                        flats: Flats,
                        builder: Builder,
                        ageOfResidents: List[Int],
                        timeOfBuilding: DateTime,
                        districtAssessment: Assessment
                      )
