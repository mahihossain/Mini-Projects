'''
This module is for creating and saving records
initially it is done on record.txt file, later
it can be implemented on database
'''

import Main

f = open('record.txt','w')
if user not in f.readline():
    createNewUser() #This method yet to be implemented
else:
    '''
    Greets with welcome message
    and prompt for choice
    '''
    
    
if __name__ == '__main__':
    main()
    '''
    It calls the main() form the Main.py because this perticular module
    (recordCreator.py)is not implemented to call from its own
    '''
