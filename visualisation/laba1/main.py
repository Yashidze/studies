from matplotlib import cm
from matplotlib.ticker import LinearLocator
import numpy as np
import matplotlib.pyplot as plt

# 1
def yfunc(x):
    return 5 * np.sin(x) * np.cos(3 * x + 1)


def zfunc(x):
    if x <= -1:
        Z = (1 + abs(x)) / (np.cbrt(1 + x + x ** 2))
    elif x >= 0:
        Z = ((x + 1) ** (3. / 5.))
    else:
        Z = (2 * np.log(1 + x ** 2) + (1 + np.cos(x) ** 4) / (2 + x))
    return Z


x_y = np.linspace(-2.5, 2.5, 100)
x_neg = np.linspace(-2.5, -1, 100)
x_pos = np.linspace(0, 2.5, 100)
x_mix = np.linspace(-1, 0, 100)

z_neg = np.array([zfunc(i) for i in x_neg])
z_pos = np.array([zfunc(i) for i in x_pos])
z_mix = np.array([zfunc(i) for i in x_mix])

plt.plot(x_y, yfunc(x_y), 'orange', label='x <= -1')
plt.plot(x_neg, z_neg, 'red', label='x <= -1')
plt.plot(x_pos, z_pos, 'blue', label='x >= 0')
plt.plot(x_mix, z_mix, 'green', label='-1 < x < 0')
plt.xlabel('x')
plt.ylabel('y')
plt.title('z_func(x) Graph')
plt.grid()
plt.legend(bbox_to_anchor=(0., 1.02, 3., 3.102), loc='lower left', mode="expand", borderaxespad=0.)
plt.show()

# 2
fig = plt.figure()
ax = fig.add_subplot(projection='3d')


def surface_func(x, y):
    return ((3 * x - 1) * np.sqrt(x) + 2 * np.sin(y) ** 2)


x = np.linspace(0, 2, 100)
y = np.linspace(0, 2, 100)
X, Y = np.meshgrid(x, y)
Z = surface_func(X, Y)

ax.plot_surface(X, Y, Z, cmap='coolwarm', alpha=0.8)

plt.show()


# 3
def cissoid(theta, alfa):
    return 2 * alfa * np.sin(theta) ** 2 / (1 + np.cos(theta))


theta = np.linspace(0, 2 * np.pi, 1000)
p = cissoid(theta, alfa=1)

plt.polar(theta, p)
plt.show()

# 4
fig = plt.figure()
ax = fig.add_subplot(projection='3d')

a = 1
b = 1
c = 1

x = np.linspace(-20, 20, 100)
y = np.linspace(-20, 20, 100)

X, Y = np.meshgrid(x, y)
Z = np.sqrt((X ** 2 / a ** 2) + (Y ** 2 / b ** 2) - 1) * c

ax.plot_surface(X, Y, Z, cmap='coolwarm', alpha=0.8)
ax.plot_surface(X, Y, -Z, cmap='coolwarm', alpha=0.8)

ax.set_xlabel('X')
ax.set_ylabel('Y')
ax.set_zlabel('Z')

plt.show()

# 5

years = [1900, 1913, 1929, 1938, 1950, 1960, 1970, 1980, 1990, 2000]
countries = ['США', 'Германія', 'Франція', 'Італія', 'СРСР']
usa = [43, 56, 69, 76.5, 93.5, 105, 128.5, 146, 157.5, 175]
germany = [16, 19, 20, 21.5, 23, 29, 37, 40.5, 46.5, 52.5]
france = [21.5, 22, 22.5, 23, 23.5, 29.5, 47, 53, 65, 76.5]
italy = (13.5, 14.5, 16, 17, 18.5, 30.5, 42, 44.5, 49, 56)
ussr = (37, 50.5, 58.8, 63, 75, 81.5, 87.5, 98, 120, 100)

colors = ['blue', 'green', 'gray', 'magenta', 'red']

# 2D
fig = plt.figure()
ax = fig.add_subplot(111)

xpos = np.arange(len(years))

ax.bar(xpos - 0.3, usa, width=0.15, color=colors[0])
ax.bar(xpos - 0.15, germany, width=0.15, color=colors[1])
ax.bar(xpos, france, width=0.15, color=colors[2])
ax.bar(xpos + 0.15, italy, width=0.15, color=colors[3])
ax.bar(xpos + 0.3, ussr, width=0.15, color=colors[4])

ax.set_title('Світове  сільськогосподарське  виробництво:   додана вартість в цінах 2000 ')
ax.set_xlabel('Роки')
ax.set_ylabel('Млрд долл')
ax.legend(countries)
ax.grid()

plt.xticks(range(len(years)), years, rotation=45)

plt.show()


# 3D
fig = plt.figure(figsize=(10, 6))
ax = fig.add_subplot(111, projection='3d')

xpos = np.arange(len(years))
ypos = np.arange(len(years))
xpos, ypos = np.meshgrid(xpos, ypos)

xpos = xpos.flatten()
ypos = ypos.flatten()
zpos = np.zeros_like(xpos)

dx = 0.5
dy = 0.5
dz = [usa, germany, france, italy, ussr]
dz = np.array(dz).flatten()


for i in range(len(dz)):
    ax.bar3d(xpos[i], ypos[i], zpos[i], dx, dy, dz[i], color=colors[i//len(years)])

ax.set_title('Світове  сільськогосподарське  виробництво:   додана вартість в цінах 2000 ')
ax.set_zlabel('Млрд долл')

plt.xticks(range(len(years)), years, rotation=45)
plt.yticks(range(len(countries)), countries, rotation=90)

plt.show()
