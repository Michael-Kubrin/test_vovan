package house

final case class House(
                        residents: Residents,
                        flats: Flat,
                        builder: Builder,
                        ageOfResidents: List[Int],
                        timeOfBuilding: DateTime,
                        districtAssessment: Assessment
                      )
