# import networkx as nx
#
# edgelist = [['Mannheim', 'Frankfurt', 85], ['Mannheim', 'Karlsruhe', 80], ['Erfurt', 'Wurzburg', 186], ['Munchen', 'Numberg', 167], ['Munchen', 'Augsburg', 84], ['Munchen', 'Kassel', 502],
#             ['Numberg', 'Stuttgart', 183], ['Numberg', 'Wurzburg', 103], ['Numberg', 'Munchen', 167], ['Stuttgart', 'Numberg', 183], ['Augsburg', 'Munchen', 84], ['Augsburg', 'Karlsruhe', 250],
#             ['Kassel', 'Munchen', 502], ['Kassel', 'Frankfurt', 173], ['Frankfurt', 'Mannheim', 85], ['Frankfurt', 'Wurzburg', 217], ['Frankfurt', 'Kassel', 173], ['Wurzburg', 'Numberg', 103],
#             ['Wurzburg', 'Erfurt', 186], ['Wurzburg', 'Frankfurt', 217], ['Karlsruhe', 'Mannheim', 80], ['Karlsruhe', 'Augsburg', 250],["Mumbai", "Delhi",400],
#             ["Delhi", "Kolkata",500],["Kolkata", "Bangalore",600],["TX", "NY",1200],["ALB", "NY",800]]
# g = nx.Graph()
# for edge in edgelist:
#     g.add_edge(edge[0],edge[1], weight = edge[2])
#
# #for i, x in enumerate(nx.connected_components(g)):
# #    print("cc"+str(i)+":",x)
#
# #print(nx.shortest_path(g, 'Stuttgart','Frankfurt',weight='weight'))
# #print(nx.shortest_path_length(g, 'Stuttgart','Frankfurt',weight='weight'))
#
# #for x in nx.all_pairs_dijkstra_path(g,weight='weight'):
# #    print(x)
#
# fb = nx.read_edgelist('../input/facebook-combined.txt', create_using = nx.Graph(), nodetype = int)
# pos = nx.spring_layout(fb)
# import warnings
# warnings.filterwarnings('ignore')
# plt.style.use('fivethirtyeight')
# plt.rcParams['figure.figsize'] = (20, 15)
# plt.axis('off')
# nx.draw_networkx(fb, pos, with_labels = False, node_size = 35)
# plt.sh`ow()
x = -10
if x < 0:
    print("The negative number ",  x, " is not valid here.")
if (x > 0):
    print(x, " is a positive number")
else:
    print(x, " is 0")

if x < 0:
    print("The negative number ",  x, " is not valid here.")
else:
    if x > 0:
        print(x, " is a positive number")
    else:
        print(x, " is 0")