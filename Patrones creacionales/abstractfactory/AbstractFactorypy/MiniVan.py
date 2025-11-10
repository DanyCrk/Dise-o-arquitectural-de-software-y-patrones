Minivan.py
import abc
class Minivan:
    __metaclass__= abc.ABCMeta
    def __init__(self):
        raise NotImplementedError()
      
    def  getMinivanName(self):
      raise NotImplementedError()
    def getMinivanFeatures(self):
      raise NotImplementedError()
class LuxuryMinivan(Minivan):
    def __init__(self, mName):
      self.__name = mName
    def getMinivanName(self):
       return self.__name
    def getMinivanFeatures(self):
       return "Luxury Mini-Van features"
class NonLuxuryMinivan(Minivan):
  def __init__(self, mName):
     self.__name = mName    
  def getMinivanName(self):
     return self.__name
  def getMinivanFeatures(self):
     return "Non-luxury Mini-Van Fatures"