
# Lister

A todo List application to handle all your needs!

## Acknowledgements

This was something  that should've been done in 4 weeks. 
but my design for 3 and a half weeks were terrible and I could
only know that after doing this all and then struggling, which lead to bad code for awhile
Thank you for anyone in the  UCF CS, ECE, & IT discord who helped
## Authors
Alexys Veloz
## Features

- Can Add items
- Can edit items once they're in
- Can load existing lists
- Can add due dates 
- Can check and sort if things are completed


## How to Use

- Add an Item:
Write a description in the description text field, and optionally 
a due date as well. Either way, they must be in the proper format.
Descriptions must be 1-256 characters, and Due dates must be in the format 
YYYY-MM-DD . (Hey so Year can be anything between 0000 and 9999, 
month must be between 01 and 12, and Day must be between 01 and 31, 
inclusive, and needs the leading zeros if it's for example 
 january 2nd in the year 2023, it needs to be 2023-01-02 for it to be in proper format).
Then click the "+" button. If there's no error, it will add it to the table.


- Remove an Item: 
You can remove an item from the table by clicking that item, then clicking the
"Remove selected Item" button. You won't be able to get it back if you didn't save, so be careful.

- Clear the List:
to clear the list, click the "Clear" button. Warning: This will delete every item off the list.
You won't be able to get them back if you didn't save before hand, so be careful.

- Edit an existing item's description:
Click on the item you want to edit, in the description column. Then write / edit the new description,
and then hit enter. If it still follows the description rule of 1-256 characters, it'll change it to the new edited description.
otherwise, it will give you an error on the bottom and won't save the description to what you set it to.
Warning: It will show whatever the description was set to, but internally it won't save it to the description it was set to if it is invalid.
Thus, trying to load, save, or sort the list with an invalid description will revert it to the original description.

- Edit (or add) an existing item's due date:
Click on the item you want to edit, in the due date column. Then write / edit the new due date,
and then hit enter. If it still follows the due date rule of YYYY-MM-DD format, it'll change it to the new due date.
otherwise, it will give you an error on the bottom and won't save the due date to what you set it to.
Warning: It will show whatever the due date was set to, but internally it won't save it to the due date it was set to if it is invalid.
Thus, trying to load, save, or sort the list with an invalid due date will revert it to the original duedate.

- How to mark an item as complete or incomplete:
Initially, every item you add is treated as incomplete. in order for it to be complete, you must click
the item you want to be complete, then "mark item Complete" button. if on any list sort other than all, it will kick you out and put you to all so you can see all the items again.
If you'd like to mark it as incomplete, click the item you wish to be as incomplete, then click the "mark item incomplete" button. If on any list sort other than "all", it will kick you out and put you to all so you can see all the items again.

- How to display all Items in the list:
Initally the table shows every item in the list, but if for some reason that changes you can just press the "all" button near the bottom left corner,
as then it will show you every item in the list.

- How to display only incomplete items in the list:
Click the "incomplete" button near the bottom left corner, and it'll show only items that are incomplete.
If there are no incomplete items (or no items at all), it will show an empty table.
If you're on the incomplete tableView and decide to mark an item as complete, it will still stay in that table visually until you press either
"all", "incomplete", or "complete" again. 

- How to display only completed items in the list:
Click the "completed" button near the bottom left corner, and it'll show only items that are completed.
If there are no completed items (or no items at all), it will show an empty table.
If you're on the completed tableView and decide to mark an item as incomplete, it will still stay in that table visually until you press either
"all", "incomplete", or "complete" again. 

- How to sort the list by Due Date:
Click on the "Due Date" column at the very top, and items will be sorted in by due date.  Clicking it once will sort them by smallest due date first(0000-01-01) and biggest due date (9999-12-31) (last. For items with no duedate, they will take precedence over even the smallest due date) Clicking the dude date column again will then sort it by biggest due date (9999-12-31) to smallest (0000-01-01). The third click does nothing, but then it cycles. every (%3 = 1) clicks will show smallest due date first, every (%3 = 2) clicks will show biggest due date first, and every (%3 = 0) clicks will do nothing. 

- How to Save a list with all its items:
Click on the "Save" button near the bottom of the screen, which will prompt a file explorer for whichever Operating System
you are on. choose through your directory where you'd like to save it to and what the file name will be.
It can be named anything, but it must be a .txt file. It will then save the list and all items into the txt at wherever location you specified.

- How to load an existing / previously saved list:
| Warning: Before loading, if you have a list with items in it at the moment I highly recommend saving, as it will delete the items
to account for the loaded in list. | To load in a list, click on the "Load" button on the bottom of the screen, which will prompt 
a file explorer for whichever Opertating System you are on. Choose through your directory the list you'd like to load! (It will only accept .txt files, and
if it wasn't a .txt made from this program it will likely give you an error that this wasn't a Lister.txt file.) Once loaded, all the items from said list will 
show up in your tableview, ready for you!

## Making your own .txt manually to work with Lister:

Lister saves items in .txts by first item up to the last item, 
showing the description, due date, and either the string "true" or "false" depending on whether the item is complete or not.
Lister also puts commas between description and duedate, and between duedate and whether its completed or not.
Then on a new line, it will do the same thing but for the next item on the list.
For example, if we have an item with description "Complete OOP Assignment", due date "2021-11-07", and it is mark completed,
and another item with description "Properly do the other assignments", due date "" (empty, the user didn't put in a due date). and it is NOT marked completed,
when saved to a txt, it would show 

Complete OOP Assignment,2021-11-07,true
Properly do the other assignments,,false

also i just realized please don't put commas in your description text or it'll mess up the parsing

