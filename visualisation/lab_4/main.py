import numpy as np
from matplotlib import pyplot as plt
from matplotlib import animation

fig = plt.figure()
fig.set_dpi(100)
fig.set_size_inches(7, 6.5)

ax = plt.axes(xlim=(0, 10), ylim=(3, 6.5))
patch = plt.Rectangle((4.5, 4.5), 2, 0.5, fc='y')


def init():
    patch.set_xy([4.5, 4.5])
    ax.add_patch(patch)
    return patch,


def animate(i):
    x, y = patch.xy
    x = 5 + 3 * np.sin(np.radians(i))
    y = 5 + 1 * np.cos(np.radians(i))
    patch.set_xy([x-1, y-0.5])
    return patch,


anim = animation.FuncAnimation(fig, animate,
                               init_func=init,
                               frames=360,
                               interval=20,
                               blit=True)

anim.save('animation.gif', writer='imagemagick', fps=60)
plt.show()
