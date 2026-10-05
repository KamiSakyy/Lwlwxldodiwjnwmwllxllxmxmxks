package s91;

import b21.v;
import c21.h0;
import c21.j;
import h0.q1;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import sy.a0;
import sy.d0;
import x61.l;
import x61.m;
import x61.r;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e {
    public e(j jVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0206, code lost:
    
        if ((r13 == sy.a0.l(r0, r11)) != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k91.a a(String str) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int i;
        c f;
        int d;
        u91.b bVar;
        u91.a aVar;
        k.g(str, "text");
        h0 h0Var = j91.a.a;
        k.g(h0Var, "root");
        q1 q1Var = new q1(3);
        ArrayList arrayList2 = q1Var.b;
        d51.f fVar = new d51.f(q1Var, n91.a.g);
        int i2 = q1Var.a;
        c cVar = (c) new l51.h(str).u;
        while (cVar != null) {
            int i3 = cVar.c;
            q1Var.a = i3;
            q1 q1Var2 = (q1) fVar.b;
            String str2 = cVar.d;
            ArrayList arrayList3 = (ArrayList) fVar.d;
            int i4 = cVar.b;
            if (i4 == -1) {
                fVar.g = new f((t91.d) fVar.c, ((t91.c) ((t91.d) fVar.e)).b(cVar), arrayList3);
            } else {
                t91.d dVar = ((f) fVar.g).b;
                k.g(dVar, "constraints");
                if (i4 == a0.l(dVar, str2)) {
                    t91.d dVar2 = ((f) fVar.g).b;
                    t91.d a = ((t91.c) dVar2).a(cVar);
                    if (a == null) {
                        a = ((f) fVar.g).b;
                    }
                    fVar.g = new f(dVar2, a, arrayList3);
                }
            }
            if (i3 >= fVar.a) {
                int size = arrayList3.size();
                while (true) {
                    if (size <= 0) {
                        arrayList = arrayList2;
                        break;
                    }
                    size--;
                    if (size < arrayList3.size()) {
                        u91.b bVar2 = (u91.b) arrayList3.get(size);
                        t91.d dVar3 = ((f) fVar.g).a;
                        bVar2.getClass();
                        k.g(dVar3, "currentConstraints");
                        int i5 = bVar2.c;
                        arrayList = arrayList2;
                        if (i5 != i3 && bVar2.d != null) {
                            aVar = u91.a.e;
                        } else if (i5 == -1 || i5 > i3) {
                            aVar = u91.a.d;
                        } else if (i5 >= i3 || bVar2.f(cVar)) {
                            aVar = bVar2.d;
                            if (aVar == null) {
                                aVar = bVar2.d(cVar, dVar3);
                            }
                        } else {
                            aVar = u91.a.d;
                        }
                        if (!k.b(aVar, u91.a.d)) {
                            fVar.a(size, aVar.a);
                            if (bVar2.a(aVar.b)) {
                                arrayList3.remove(size);
                                fVar.c();
                            }
                            if (aVar.c == 2) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    arrayList2 = arrayList;
                }
                z = true;
            } else {
                arrayList = arrayList2;
                z = false;
            }
            t91.d dVar4 = ((f) fVar.g).a;
            k.g(dVar4, "constraints");
            if (i4 == a0.l(dVar4, str2) && ((bVar = (u91.b) m.f0(arrayList3)) == null || bVar.b())) {
                List<u91.b> list = r.r;
                if (i4 == -1) {
                    z2 = z;
                } else {
                    t91.d dVar5 = ((f) fVar.g).a;
                    k.g(dVar5, "constraints");
                    if (i4 != a0.l(dVar5, str2)) {
                        throw new MarkdownParsingException("");
                    }
                    ArrayList arrayList4 = (ArrayList) fVar.i;
                    int size2 = arrayList4.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            Object obj = arrayList4.get(i6);
                            i6++;
                            z2 = z;
                            u91.c cVar2 = (u91.c) obj;
                            List list2 = list;
                            List b = cVar2.b(cVar, q1Var2, (f) fVar.g);
                            if (!b.isEmpty()) {
                                list = b;
                                break;
                            }
                            list = list2;
                            z = z2;
                        } else {
                            z2 = z;
                            list = (i4 < a0.l(((f) fVar.g).b, str2) || cVar.a() == null) ? list : d0.n(new v91.h(((f) fVar.g).a, new v(q1Var2), fVar.f));
                        }
                    }
                }
                for (u91.b bVar3 : list) {
                    k.g(bVar3, "newMarkerBlock");
                    arrayList3.add(bVar3);
                    fVar.c();
                    z2 = true;
                }
            } else {
                z2 = z;
            }
            if (z2) {
                u91.b bVar4 = (u91.b) m.f0(arrayList3);
                if (bVar4 == null) {
                    d = cVar.d();
                } else if (bVar4.d != null) {
                    d = i3 + 1;
                } else {
                    int i7 = bVar4.c;
                    if (i7 != -1 && i7 <= i3) {
                        bVar4.c = bVar4.c(cVar);
                    }
                    d = bVar4.c;
                }
                i = -1;
                if (d == -1) {
                    d = Integer.MAX_VALUE;
                }
                fVar.a = d;
            } else {
                i = -1;
            }
            if (i4 != i) {
                t91.d dVar6 = ((f) fVar.g).a;
                k.g(dVar6, "constraints");
            }
            int l = a0.l(((f) fVar.g).b, str2) - i4;
            if (l > 0) {
                if (i4 != -1 && ((t91.c) ((f) fVar.g).b).g() <= ((t91.c) ((t91.d) fVar.e)).g()) {
                    t91.d dVar7 = ((f) fVar.g).b;
                    int i8 = cVar.c;
                    int i9 = cVar.b;
                    String str3 = cVar.d;
                    k.g(dVar7, "constraints");
                    if ((dVar7 instanceof n91.a) && ((n91.a) dVar7).f) {
                        int i10 = i9;
                        while (i10 < str3.length() && str3.charAt(i10) != '[') {
                            i10++;
                        }
                        if (i10 == str3.length()) {
                            fVar.b(q1Var2, cVar, dVar7);
                        } else {
                            Character S = l.S(((t91.c) dVar7).b);
                            int i11 = i8 - i9;
                            int i12 = i10 + i11;
                            q1Var2.a(l.r(new x91.e[]{new x91.e(new q71.g(i8, i12, 1), (S != null && S.charValue() == '>') ? j91.a.G : ((S != null && S.charValue() == '.') || (S != null && S.charValue() == ')')) ? j91.a.g0 : j91.a.d0), new x91.e(new q71.g(i12, Math.min(a0.l(dVar7, str3) + i11, cVar.d()), 1), n91.c.d)}));
                        }
                    } else {
                        fVar.b(q1Var2, cVar, dVar7);
                    }
                }
                f = cVar.f(l);
                cVar = f;
                arrayList2 = arrayList;
            }
            f = cVar.f(fVar.a - i3);
            cVar = f;
            arrayList2 = arrayList;
        }
        ArrayList arrayList5 = arrayList2;
        q1Var.a = str.length();
        fVar.a(-1, 3);
        k.g(h0Var, "type");
        arrayList5.add(new x91.e(new q71.g(i2, q1Var.a, 1), h0Var));
        return new g(8, new d(this, str)).m(arrayList5);
    }
}
