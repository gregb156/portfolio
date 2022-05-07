# people = ['Dr. Christopher Brooks', 'Dr. Kevyn Collins-Thompson', 'Dr. VG Vinod Vydiswaran', 'Dr. Daniel Romero']
#
# def split_title_and_name(person):
#      return person.split()[0] + person.split()[-1]
#
# print(list(map(split_title_and_name,people)))
#
# values = (1,2,3,4,5,6,4,5)
#
# a,b,c,*_ = values
# print(a,b,c)
#
# print(values.count(5))


# list1 = [1,'ate',7]
# list1 = list1 + [2]
# list1.insert(0,'pizza')
# print(list1)

# some_tuples = ([1,2,3],[4,5,6],[7,8,9])
#
# print([x for n in some_tuples [for x in n])

def f():
    a = 5
    b = 6
    c = 7
    return {'a':a,'b':b,'c':c}

a= f()

print(a)