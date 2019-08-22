/**                                                                                 
  ,dW"Yvd `7MMpMMMb.pMMMb.  M"""MMV     ,p6"bo   ,pW"Wq.`7MMpMMMb.pMMMb.      ,6"Yb.`7MM  `7MM  
 ,W'   MM   MM    MM    MM  '  AMV     6M'  OO  6W'   `Wb MM    MM    MM     8)   MM  MM    MM  
 8M    MM   MM    MM    MM    AMV      8M       8M     M8 MM    MM    MM      ,pm9MM  MM    MM  
 YA.   MM   MM    MM    MM   AMV  , ,, YM.    , YA.   ,A9 MM    MM    MM  ,, 8M   MM  MM    MM  
  `MbmdMM .JMML  JMML  JMML.AMMmmmM db  YMbmd'   `Ybmd9'.JMML  JMML  JMML.db `Moo9^Yo.`Mbod"YML.
       MM                                                                                       
     .JMML.                                                                                     
       
 * This code snippet is copyright at qmz.com.au
 * - qmz.com.au is a top-ranking IT consulting firm that specialised in
 * - Mobile Development, Web Development, Machine Learning, and Cloud Computing.
 * - We provide individual and company training for professional development.
 * - Find out more information in our official site：
 * - https://qmz.com.au                                                                   
 */

struct FixedSizeArray<T> {
  private var maxSize: Int
  private var defaultValue: T
  private var array: [T]
  private (set) var count = 0

  init(maxSize: Int, defaultValue: T) {
    self.maxSize = maxSize
    self.defaultValue = defaultValue
    self.array = [T](repeating: defaultValue, count: maxSize)
  }

  subscript(index: Int) -> T {
    assert(index >= 0)
    assert(index < count)
    return array[index]
  }

  mutating func append(_ newElement: T) {
    assert(count < maxSize)
    array[count] = newElement
    count += 1
  }

  mutating func removeAt(index: Int) -> T {
    assert(index >= 0)
    assert(index < count)
    count -= 1
    let result = array[index]
    array[index] = array[count]
    array[count] = defaultValue
    return result
  }

  mutating func removeAll() {
    for i in 0..<count {
      array[i] = defaultValue
    }
    count = 0
  }
}
