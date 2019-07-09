/**
 * This code snippet is copyright at qmz.com.au
 * - qmz.com.au is a top-ranking IT consulting firm that specialised in
 * - Mobile Development, Web Development, Machine Learning, and Cloud Computing.
 * - We provide individual and company training for professional development.
 * - Find out more information in our official site：
 * - https://qmz.com.au
 */

// A Tic-Tac-Toe board is given as a string array board. Return True if and only if it is possible to reach this board position during the course of a valid tic-tac-toe game.

// The board is a 3 x 3 array, and consists of characters " ", "X", and "O".  The " " character represents an empty square.

// Here are the rules of Tic-Tac-Toe:

// Players take turns placing characters into empty squares (" ").
// The first player always places "X" characters, while the second player always places "O" characters.
// "X" and "O" characters are always placed into empty squares, never filled ones.
// The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
// The game also ends if all squares are non-empty.
// No more moves can be played if the game is over.
// Example 1:
// Input: board = ["O  ", "   ", "   "]
// Output: false
// Explanation: The first player always plays "X".

// Example 2:
// Input: board = ["XOX", " X ", "   "]
// Output: false
// Explanation: Players take turns making moves.

// Example 3:
// Input: board = ["XXX", "   ", "OOO"]
// Output: false

// Example 4:
// Input: board = ["XOX", "O O", "XOX"]
// Output: true
// Note:

// board is a length-3 array of strings, where each string board[i] has length 3.
// Each board[i][j] is a character in the set {" ", "X", "O"}.

class Solution {
    var gameBoard: [[Character]] = []
    var numberOfX: Int = 0
    var numberOfO: Int = 0

    func validTicTacToe(_ board: [String]) -> Bool {

        initGameBoard(board)

        // X goes first
        if numberOfO > numberOfX { return false }
        // Players take turns placing characters
        if numberOfX - numberOfO > 1 { return false }
        // Both Players can't win
        if didPlayerWins(with: Character("X")) && didPlayerWins(with: Character("O")) { return false }
        // X wins only, but wrong O numbers
        if didPlayerWins(with: Character("X")) && numberOfX == numberOfO { return false }
        // O wins only, but wrong X numbers
        if didPlayerWins(with: Character("O")) && numberOfX > numberOfO { return false }

        return true
    }

    func initGameBoard(_ board: [String]) {
        gameBoard.reserveCapacity(3)
        
        for i in 0...2 {
            for j in 0...2 {
                let char: Character = Array(board[i])[j]
                gameBoard[i][j] = char

                if char == Character("X") { numberOfX += 1 }
                if char == Character("O") { numberOfO += 1 }
            }
        }
    }

    func didPlayerWins(with char: Character) -> Bool {

        func didRowHasSame(_ char: Character) -> Bool {
            for i in 0...2 {
                if gameBoard[i][0] == char && gameBoard[i][1] == char && gameBoard[i][0] == char { return true }
            }
            return false
        }

        func didColumnHasSame(_ char: Character) -> Bool {
            for i in 0...2 {
                if gameBoard[0][i] == char && gameBoard[1][i] == char && gameBoard[2][i] == char { return true }
            }
            return false
        }

        func didDiagnolHasSame(_ char: Character) -> Bool {
            if gameBoard[0][0] == char && gameBoard[1][1] == char && gameBoard[2][2] == char { return true }
            if gameBoard[0][2] == char && gameBoard[1][1] == char && gameBoard[2][0] == char { return true }
            return false
        }

        if didRowHasSame(char) { return true }
        if didColumnHasSame(char) { return true }
        if didDiagnolHasSame(char) { return true }

        return false
    }
}
