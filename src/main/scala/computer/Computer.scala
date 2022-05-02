package computer

case class Computer(
                     nameOfOwnerOfComputer: String,
                     nameOfProducer: String,
                     ram: Ram,
                     videoCard: VideoCard,
                     processor: Processor,
                     operationSystem: OS
                   )
