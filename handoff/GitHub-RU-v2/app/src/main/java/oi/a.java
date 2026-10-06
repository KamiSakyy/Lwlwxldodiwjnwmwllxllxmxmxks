package oi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pi.d;
import pi.e;
import pi.f;
import pi.g;
import pi.h;
import pi.i;
import pi.m;
import pi.n;
import t71.j;
import t71.l;
import t71.p;
import t71.w;
import w61.r;
import x61.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends c {
    public r[] b;

    public a() {
        super("\\u001b\\[(\\d+(?:;\\d+)*)?m");
        this.b = new r[]{new r((byte) 0), new r((byte) 51), new r((byte) 102), new r((byte) -103), new r((byte) -52), new r((byte) -1)};
    }

    public static final e b(a aVar, d dVar, k kVar) {
        Integer num;
        int intValue;
        Integer num2 = (Integer) kVar.n();
        if (num2 == null) {
            return null;
        }
        if (num2.intValue() != 5) {
            if (num2.intValue() != 2 || (num = (Integer) kVar.n()) == null) {
                return null;
            }
            int intValue2 = num.intValue();
            Integer num3 = (Integer) kVar.n();
            if (num3 == null) {
                return null;
            }
            int intValue3 = num3.intValue();
            Integer num4 = (Integer) kVar.n();
            if (num4 == null) {
                return null;
            }
            int intValue4 = num4.intValue();
            if (intValue2 < 0 || intValue2 >= 256 || intValue3 < 0 || intValue3 >= 256 || intValue4 < 0 || intValue4 >= 256) {
                return null;
            }
            return new g(dVar, (byte) intValue2, (byte) intValue3, (byte) intValue4);
        }
        Integer num5 = (Integer) kVar.n();
        if (num5 == null || (intValue = num5.intValue()) < 0 || intValue >= 256) {
            return null;
        }
        r[] rVarArr = aVar.b;
        if (intValue <= 0) {
            return null;
        }
        if (intValue <= 7) {
            i.Companion.getClass();
            i a = h.a(num5);
            if (a != null) {
                return new pi.a(d.s, a, false);
            }
            return null;
        }
        if (intValue <= 15) {
            h hVar = i.Companion;
            Integer valueOf = Integer.valueOf(intValue - 8);
            hVar.getClass();
            i a2 = h.a(valueOf);
            if (a2 != null) {
                return new pi.a(d.s, a2, true);
            }
            return null;
        }
        if (intValue <= 231) {
            int i = intValue - 16;
            float f = i;
            return new g(dVar, rVarArr[(int) Math.floor(f / 36.0f)].r, rVarArr[((int) Math.floor(f / 6.0f)) % 6].r, rVarArr[i % 6].r);
        }
        if (intValue > 255) {
            return null;
        }
        byte b = (byte) (((intValue - 232) * 10) + 8);
        return new g(dVar, b, b, b);
    }

    @Override // oi.c
    public final m a(l lVar) {
        ArrayList arrayList;
        d dVar;
        k71.k.g(lVar, "match");
        j b = lVar.c.b(1);
        ArrayList arrayList2 = x61.r.r;
        if (b != null) {
            List g0 = p.g0(b.a, new String[]{";"}, 6);
            arrayList = new ArrayList();
            Iterator it = g0.iterator();
            while (it.hasNext()) {
                Integer G = w.G((String) it.next());
                if (G != null) {
                    arrayList.add(G);
                }
            }
        } else {
            arrayList = arrayList2;
        }
        k kVar = new k(arrayList);
        ArrayList arrayList3 = new ArrayList();
        while (true) {
            if (!kVar.isEmpty()) {
                Integer num = (Integer) kVar.n();
                e eVar = null;
                if (num != null) {
                    int intValue = num.intValue();
                    int i = 0;
                    if (30 <= intValue && intValue < 38) {
                        h hVar = i.Companion;
                        Integer valueOf = Integer.valueOf(num.intValue() - 30);
                        hVar.getClass();
                        i a = h.a(valueOf);
                        if (a != null) {
                            eVar = new pi.a(d.s, a, false);
                        }
                    } else if (num.intValue() == 38) {
                        eVar = b(this, d.s, kVar);
                    } else {
                        int intValue2 = num.intValue();
                        if (40 <= intValue2 && intValue2 < 48) {
                            h hVar2 = i.Companion;
                            Integer valueOf2 = Integer.valueOf(num.intValue() - 40);
                            hVar2.getClass();
                            i a2 = h.a(valueOf2);
                            if (a2 != null) {
                                eVar = new pi.a(d.t, a2, false);
                            }
                        } else if (num.intValue() == 48) {
                            eVar = b(this, d.t, kVar);
                        } else {
                            int intValue3 = num.intValue();
                            if (90 > intValue3 || intValue3 >= 98) {
                                int intValue4 = num.intValue();
                                if (100 > intValue4 || intValue4 >= 108) {
                                    d.Companion.getClass();
                                    d[] values = d.values();
                                    int length = values.length;
                                    while (true) {
                                        if (i >= length) {
                                            dVar = null;
                                            break;
                                        }
                                        dVar = values[i];
                                        if (dVar.r == num.intValue()) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (dVar != null) {
                                        eVar = new pi.b(dVar);
                                    }
                                } else {
                                    h hVar3 = i.Companion;
                                    Integer valueOf3 = Integer.valueOf(num.intValue() - 100);
                                    hVar3.getClass();
                                    i a3 = h.a(valueOf3);
                                    if (a3 != null) {
                                        eVar = new pi.a(d.t, a3, true);
                                    }
                                }
                            } else {
                                h hVar4 = i.Companion;
                                Integer valueOf4 = Integer.valueOf(num.intValue() - 90);
                                hVar4.getClass();
                                i a4 = h.a(valueOf4);
                                if (a4 != null) {
                                    eVar = new pi.a(d.s, a4, true);
                                }
                            }
                        }
                    }
                }
                if (eVar == null) {
                    break;
                }
                arrayList3.add(eVar);
            } else {
                arrayList2 = arrayList3;
                break;
            }
        }
        return !arrayList2.isEmpty() ? new m(lVar.b(), new f(lVar.c(), arrayList2)) : new m(lVar.b(), new n(lVar.c()));
    }
}
