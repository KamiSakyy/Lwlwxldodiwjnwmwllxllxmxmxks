package s0;

import android.view.KeyEvent;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31480a;

    public final g0 a(KeyEvent keyEvent) {
        g0 g0Var;
        g0 g0Var2 = null;
        switch (this.f31480a) {
            case k5.f.J:
                int i = i0.f31489y;
                if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                    if (o2.a.a(o2.c.a(keyEvent.getKeyCode()), o2.a.f29953q)) {
                        return g0.f31464n0;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    long b10 = o2.c.b(keyEvent);
                    if (o2.a.a(b10, o2.a.f29948j) || o2.a.a(b10, o2.a.f29962z)) {
                        return g0.J;
                    }
                    if (o2.a.a(b10, o2.a.f29950n)) {
                        return g0.K;
                    }
                    if (o2.a.a(b10, o2.a.f29951o)) {
                        return g0.L;
                    }
                    if (o2.a.a(b10, o2.a.i)) {
                        return g0.S;
                    }
                    if (o2.a.a(b10, o2.a.f29952p)) {
                        return g0.f31464n0;
                    }
                    if (o2.a.a(b10, o2.a.f29953q)) {
                        return g0.f31463m0;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    return null;
                }
                if (keyEvent.isShiftPressed()) {
                    long a10 = o2.c.a(keyEvent.getKeyCode());
                    if (o2.a.a(a10, o2.a.f29945f)) {
                        return g0.T;
                    }
                    if (o2.a.a(a10, o2.a.f29946g)) {
                        return g0.U;
                    }
                    if (o2.a.a(a10, o2.a.f29943d)) {
                        return g0.V;
                    }
                    if (o2.a.a(a10, o2.a.f29944e)) {
                        return g0.W;
                    }
                    if (o2.a.a(a10, o2.a.E)) {
                        return g0.X;
                    }
                    if (o2.a.a(a10, o2.a.F)) {
                        return g0.Y;
                    }
                    if (o2.a.a(a10, o2.a.f29960x)) {
                        return g0.f31456f0;
                    }
                    if (o2.a.a(a10, o2.a.f29961y)) {
                        return g0.f31457g0;
                    }
                    if (o2.a.a(a10, o2.a.f29962z)) {
                        return g0.K;
                    }
                    return null;
                }
                long a11 = o2.c.a(keyEvent.getKeyCode());
                if (o2.a.a(a11, o2.a.f29945f)) {
                    return g0.f31466s;
                }
                if (o2.a.a(a11, o2.a.f29946g)) {
                    return g0.f31467t;
                }
                if (o2.a.a(a11, o2.a.f29943d)) {
                    return g0.C;
                }
                if (o2.a.a(a11, o2.a.f29944e)) {
                    return g0.D;
                }
                if (o2.a.a(a11, o2.a.f29947h)) {
                    return g0.E;
                }
                if (o2.a.a(a11, o2.a.E)) {
                    return g0.F;
                }
                if (o2.a.a(a11, o2.a.F)) {
                    return g0.G;
                }
                if (o2.a.a(a11, o2.a.f29960x)) {
                    return g0.f31472y;
                }
                if (o2.a.a(a11, o2.a.f29961y)) {
                    return g0.f31473z;
                }
                if (o2.a.a(a11, o2.a.f29956t) || o2.a.a(a11, o2.a.G)) {
                    return g0.f31461k0;
                }
                if (o2.a.a(a11, o2.a.f29957u)) {
                    return g0.M;
                }
                if (o2.a.a(a11, o2.a.f29958v)) {
                    return g0.N;
                }
                if (o2.a.a(a11, o2.a.C)) {
                    return g0.K;
                }
                if (o2.a.a(a11, o2.a.A)) {
                    return g0.L;
                }
                if (o2.a.a(a11, o2.a.B)) {
                    return g0.J;
                }
                if (o2.a.a(a11, o2.a.f29954r)) {
                    return g0.f31462l0;
                }
                return null;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long a12 = o2.c.a(keyEvent.getKeyCode());
                    if (o2.a.a(a12, o2.a.f29945f)) {
                        g0Var = g0.f31458h0;
                    } else if (o2.a.a(a12, o2.a.f29946g)) {
                        g0Var = g0.f31459i0;
                    } else if (o2.a.a(a12, o2.a.f29943d)) {
                        g0Var = g0.Z;
                    } else {
                        if (o2.a.a(a12, o2.a.f29944e)) {
                            g0Var = g0.f31451a0;
                        }
                        g0Var = null;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long a13 = o2.c.a(keyEvent.getKeyCode());
                        if (o2.a.a(a13, o2.a.f29945f)) {
                            g0Var = g0.A;
                        } else if (o2.a.a(a13, o2.a.f29946g)) {
                            g0Var = g0.B;
                        } else if (o2.a.a(a13, o2.a.f29943d)) {
                            g0Var = g0.H;
                        } else if (o2.a.a(a13, o2.a.f29944e)) {
                            g0Var = g0.I;
                        }
                    }
                    g0Var = null;
                }
                if (g0Var != null) {
                    return g0Var;
                }
                kk.a aVar = j0.f31493a;
                aVar.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long a14 = o2.c.a(keyEvent.getKeyCode());
                    if (o2.a.a(a14, o2.a.f29945f)) {
                        g0Var2 = g0.f31452b0;
                    } else if (o2.a.a(a14, o2.a.f29946g)) {
                        g0Var2 = g0.f31453c0;
                    } else if (o2.a.a(a14, o2.a.f29943d)) {
                        g0Var2 = g0.f31455e0;
                    } else if (o2.a.a(a14, o2.a.f29944e)) {
                        g0Var2 = g0.f31454d0;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long a15 = o2.c.a(keyEvent.getKeyCode());
                    if (o2.a.a(a15, o2.a.f29945f)) {
                        g0Var2 = g0.f31469v;
                    } else if (o2.a.a(a15, o2.a.f29946g)) {
                        g0Var2 = g0.f31468u;
                    } else if (o2.a.a(a15, o2.a.f29943d)) {
                        g0Var2 = g0.f31471x;
                    } else if (o2.a.a(a15, o2.a.f29944e)) {
                        g0Var2 = g0.f31470w;
                    } else if (o2.a.a(a15, o2.a.f29949k)) {
                        g0Var2 = g0.M;
                    } else if (o2.a.a(a15, o2.a.f29958v)) {
                        g0Var2 = g0.P;
                    } else if (o2.a.a(a15, o2.a.f29957u)) {
                        g0Var2 = g0.O;
                    } else if (o2.a.a(a15, o2.a.D)) {
                        g0Var2 = g0.f31460j0;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long a16 = o2.c.a(keyEvent.getKeyCode());
                    if (o2.a.a(a16, o2.a.f29960x)) {
                        g0Var2 = g0.f31456f0;
                    } else if (o2.a.a(a16, o2.a.f29961y)) {
                        g0Var2 = g0.f31457g0;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long a17 = o2.c.a(keyEvent.getKeyCode());
                    if (o2.a.a(a17, o2.a.f29957u)) {
                        g0Var2 = g0.Q;
                    } else if (o2.a.a(a17, o2.a.f29958v)) {
                        g0Var2 = g0.R;
                    }
                }
                return g0Var2 == null ? ((h0) aVar.s).a(keyEvent) : g0Var2;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g0<T1,T2,T3,T4> {
        public g0() {
        }
    }
}
