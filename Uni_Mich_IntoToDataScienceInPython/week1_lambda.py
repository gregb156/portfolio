# # num = [1,2,3,4,5]
# #
# # x = list(map(lambda x:x+1,num))
# # print(x)
#
#
# #people = ['Dr. Christopher Brooks', 'Dr. Kevyn Collins-Thompson', 'Dr. VG Vinod Vydiswaran', 'Dr. Daniel Romero']
#
# people = ['Dr. Christopher Brooks', 'Dr. Kevyn Collins-Thompson', 'Dr. VG Vinod Vydiswaran', 'Dr. Daniel Romero']
#
# def split_title_and_name(person):
#     return person[0].split()[0] + ' ' + person[0].split()[-1]
#
# #option 1
#
#
#
# # test = list(map(lambda person: str(person).split()[0]+" "+str(person).split()[-1],people))
# # print(test)
# people = ['Dr. Christopher Brooks', 'Dr. Kevyn Collins-Thompson', 'Dr. VG Vinod Vydiswaran', 'Dr. Daniel Romero']
#
# def split_title_and_name(person):
#     return person.split()[0] + ' ' + person.split()[-1]
#
# #option 1
# for person in people:
#     lamb = lambda person: person.split()[0] + ' ' + person.split()[-1]
#     print(split_title_and_name(person)==lamb(person))
#
# #option 2
# #list(map(split_title_and_name, people)) == list(map(???))
#
people = ['Dr. Christopher Brooks', 'Dr. Kevyn Collins-Thompson', 'Dr. VG Vinod Vydiswaran', 'Dr. Daniel Romero']

people = ['Dr. Christopher Brooks', 'Dr. Kevyn Collins-Thompson', 'Dr. VG Vinod Vydiswaran', 'Dr. Daniel Romero']

def split_title_and_name(person):
    return person.split()[0] + ' ' + person.split()[-1]

#option 1
for person in people:
     lamb = lambda person: person.split()[0] + ' ' + person.split()[-1]
     print(split_title_and_name(person)==lamb(person))

#option 2
#list(map(split_title_and_name, people)) == list(map(???))
