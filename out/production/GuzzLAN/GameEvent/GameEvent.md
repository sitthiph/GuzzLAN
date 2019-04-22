# GameEvent

GameEvent is an interface for the event that could happen to player with a set percentage of chance. These event can result in player gain/lose money and gain advantage/disadvantage. of the game.

Each GameEvent will consist of these abstract method :

```java
boolean eventHits(); // using built-in algorithm, return if the player get the event.
void updateAlgorithm(); // use to update algorithm when each round is complete.
void displayEvent(); // display that the event has occured via JavaFX.
  ```

### List of all the GameEvent

  - Double Guess
  - Skip or Hit
  - Equivalent Exchange
  - Luck of a Draw
  - Double Edge Sword
  - Payday
  - Hand of the Chosen One
___

# Double Guess

Double Guess event allows player to pay a certain amount of money for an extra guess

| Round | Money Rate | Money Start Rate| Money End Rate | Money Rate of Change | Appear Rate | Appear Start Rate | Appear End Rate  | Appear Rate of Change |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| All | $10 - $200 | $10 | $200 | ~103.75% | 2% - 30% | 2% | 30% | 150% |

List of method :
```java
method one() // Place Holder
method two() // Place Holder.
```
___

# Skip or Hit

Skip or Hit event allows player to pay a certain amount to prevent them from being skipped. Instead of `Round`, the rate changes according to the guess `range`.

| `Range` | Money Rate | Money Start Rate| Money End Rate | Money Rate of Change | Appear Rate | Appear Start Rate | Appear End Rate  | Appear Rate of Change |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| >1000 | NA | NA | NA | NA | NA | NA | NA | NA |
| 100 - 1000 | Randomized | $50 - $100 | $50 - $100 | N/A | 15% | 15% | 15% | 0% |
| < 100 | Randomized | $50 - $100 | $50 - $100 | N/A | 30% | 30% | 30% | 0% |
___

# Equivalent Exchange

Equivalent Exchange event allows player to voluntarily skip themselves for the round to acquire high return of money.

| Round | Money Rate | Money Start Rate| Money End Rate | Money Rate of Change | Appear Rate | Appear Start Rate | Appear End Rate  | Appear Rate of Change |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 0 - 5 | Determind via algorithm | N/A | N/A | `DoubleGuess Cost` x ( (1 - 10) x 10) | 30 % | 30 % | 30 % | 0 % |
| 6 - 40 | Determind via algorithm | N/A | N/A | `DoubleGuess Cost` x ( (1 - 10) x 10) | 5 % | - | - | 0 % |
| 40+ | Determind via algorithm | N/A | N/A | `DoubleGuess Cost` x ( (1 - 10) x 10) | 30 % | 30 % | 30 % | 0 % |

List of method :
```java
method one() // Place Holder
method two() // Place Holder.
```
___

# Luck of a Draw

Luck of a Draw event allows player to gamble their money before doing their guess. Player will choose an number between 1 - 6 and amount of money they wish to gamble. If bet correctly (~16.7 %), the player will gain 5 times the amount gambled.

| Round | Money Rate | Money Start Rate| Money End Rate | Money Rate of Change | Appear Rate | Appear Start Rate | Appear End Rate  | Appear Rate of Change |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| All | Determine by Player | - | - | +500 % or -100 % | 10 % | - | - | 0 % |

List of method :
```java
method one() // Place Holder
method two() // Place Holder.
```
___

# Double Edge Sword

Similarly to Luck of a Draw, Double Edge Sword allows player to gamble fixed amount of money before doing their guess. Player will choose between `Head` or `Tail`. If choose correctly (50%), the player will gain doubled the amount gambled.

| Round | Money Rate | Money Start Rate| Money End Rate | Money Rate of Change | Appear Rate | Appear Start Rate | Appear End Rate  | Appear Rate of Change |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| All | Randomized | - | - | +200 % or -100 % | 15 % | - | - | 0 % |

List of method :
```java
method one() // Place Holder
method two() // Place Holder.
```
___

# Payday

Payday event pays the player a certain amount of money. The event does not begin appearing until round 6.

| Round | Money Rate | Money Start Rate| Money End Rate | Money Rate of Change | Appear Rate | Appear Start Rate | Appear End Rate  | Appear Rate of Change |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 0 - 5 | NA | NA | NA | NA | NA | NA | NA | NA |
| 6+ | $10 - $200 | $10 | $200 | ~103.75% | 2% - 30% | 2% | 30% | 150% |

List of method :
```java
method one() // Place Holder
method two() // Place Holder.
```
___

# Hand of the Chosen One
Hnad of the Chosen One event allows the player to pick any of the game event **EXCEPT FOR** `Payday`
| Round | Money Rate | Money Start Rate| Money End Rate | Money Rate of Change | Appear Rate | Appear Start Rate | Appear End Rate  | Appear Rate of Change |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| All | $0 | $0 | $0 | 0% | 1% | 1% | 1% | 0% |

List of method :
```java
method one() // Place Holder
method two() // Place Holder.
```
