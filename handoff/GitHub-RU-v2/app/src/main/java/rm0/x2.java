package rm0;

import com.github.service.models.response.GitObjectType;
import java.util.ArrayList;
import java.util.List;
import jn0.vz;
import jn0.wz;
import jn0.yz;
import jo.v10;
import jo.w10;
import jo.y10;
import kc0.ay;
import kc0.ey;
import kc0.fw;
import kc0.fy;
import kc0.gw;
import kc0.iw;
import kc0.yx;
import u10.aw;
import u10.cw;
import u10.ru;
import u10.su;
import u10.uu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x2 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;

    public /* synthetic */ x2(y71.j jVar, String str, String str2, int i) {
        this.r = i;
        this.s = jVar;
        this.t = str;
        this.u = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x023c, code lost:
    
        if (r13 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c5, code lost:
    
        if (r13 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r13 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04a0, code lost:
    
        if (r13 == null) goto L268;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        w2Shadow w2Var;
        int i;
        GitObjectType gitObjectType;
        String str;
        g5 g5Var;
        int i2;
        ni0.d dVar;
        ni0.d dVar2;
        ni0.d dVar3;
        i5 i5Var;
        int i3;
        t00.k2 k2Var;
        int i4;
        GitObjectType gitObjectType2;
        String str2;
        vb0.w1Shadow w1Var;
        int i5;
        GitObjectType gitObjectType3;
        String str3;
        vb0.u3 u3Var;
        int i6;
        v70.d dVar4;
        v70.d dVar5;
        v70.d dVar6;
        vb0.v3Shadow v3Var;
        int i7;
        wy0.c2Shadow c2Var;
        int i8;
        GitObjectType gitObjectType4;
        String str4;
        switch (this.r) {
            case 0:
                if (cVar instanceof w2Shadow) {
                    w2Var = (w2Shadow) cVar;
                    int i9 = w2Var.v;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        w2Var.v = i9 - Integer.MIN_VALUE;
                        Object obj2 = w2Var.u;
                        b71.a aVar = b71.a.r;
                        i = w2Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            fw fwVar = (fw) obj;
                            k71.k.g(fwVar, "<this>");
                            String str5 = this.t;
                            k71.k.g(str5, "branchOrCommitName");
                            String str6 = this.u;
                            k71.k.g(str6, "path");
                            iw iwVar = fwVar.a;
                            if (iwVar == null) {
                                throw new IllegalStateException("Invalid repository data");
                            }
                            gw gwVar = iwVar.b;
                            if (gwVar != null && (str = gwVar.a) != null) {
                                GitObjectType.Companion.getClass();
                                gitObjectType = yz0.s1.a(str);
                                break;
                            }
                            gitObjectType = GitObjectType.UNKNOWN__;
                            yz0.r1 r1Var = new yz0.r1(gitObjectType, iwVar.a, str5, str6, iwVar.c != null);
                            w2Var.v = 1;
                            if (this.s.c(r1Var, w2Var) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return w61.a0.a;
                    }
                }
                w2Var = new w2Shadow(this, cVar);
                Object obj22 = w2Var.u;
                b71.a aVar2 = b71.a.r;
                i = w2Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof g5) {
                    g5Var = (g5) cVar;
                    int i10 = g5Var.v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        g5Var.v = i10 - Integer.MIN_VALUE;
                        Object obj3 = g5Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = g5Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            yx yxVar = (yx) obj;
                            ay ayVar = yxVar.a;
                            String str7 = null;
                            List list = (ayVar == null || (dVar3 = ayVar.a.b) == null) ? null : dVar3.b.b;
                            if (list == null) {
                                list = x61.rShadow.r;
                            }
                            ArrayList S = x61.m.S(list);
                            ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj4 = S.get(i12);
                                i12++;
                                arrayList.add(y41.t1.k(this.t, this.u, ((ni0.a) obj4).c));
                            }
                            ay ayVar2 = yxVar.a;
                            boolean z = (ayVar2 == null || (dVar2 = ayVar2.a.b) == null) ? false : dVar2.b.a.a;
                            if (ayVar2 != null && (dVar = ayVar2.a.b) != null) {
                                str7 = dVar.b.a.b;
                            }
                            w61.k kVar = new w61.k(arrayList, new x01.i(str7, z, false));
                            g5Var.v = 1;
                            if (this.s.c(kVar, g5Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                g5Var = new g5(this, cVar);
                Object obj32 = g5Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = g5Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof i5) {
                    i5Var = (i5) cVar;
                    int i13 = i5Var.v;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        i5Var.v = i13 - Integer.MIN_VALUE;
                        Object obj5 = i5Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = i5Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj5);
                            ey eyVar = (ey) obj;
                            fy fyVar = eyVar.a;
                            List list2 = fyVar != null ? fyVar.c.b.b : null;
                            if (list2 == null) {
                                list2 = x61.rShadow.r;
                            }
                            ArrayList S2 = x61.m.S(list2);
                            ArrayList arrayList2 = new ArrayList(x61.n.F(S2, 10));
                            int size2 = S2.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                Object obj6 = S2.get(i14);
                                i14++;
                                arrayList2.add(y41.t1.k(this.t, this.u, ((ni0.a) obj6).c));
                            }
                            fy fyVar2 = eyVar.a;
                            w61.k kVar2 = new w61.k(arrayList2, new x01.i(fyVar2 != null ? fyVar2.c.b.a.b : null, fyVar2 != null ? fyVar2.c.b.a.a : false, false));
                            i5Var.v = 1;
                            if (this.s.c(kVar2, i5Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                i5Var = new i5(this, cVar);
                Object obj52 = i5Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = i5Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof t00.k2) {
                    k2Var = (t00.k2) cVar;
                    int i15 = k2Var.v;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        k2Var.v = i15 - Integer.MIN_VALUE;
                        Object obj7 = k2Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = k2Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj7);
                            v10 v10Var = (v10) obj;
                            k71.k.g(v10Var, "<this>");
                            String str8 = this.t;
                            k71.k.g(str8, "branchOrCommitName");
                            String str9 = this.u;
                            k71.k.g(str9, "path");
                            y10 y10Var = v10Var.a;
                            if (y10Var == null) {
                                throw new IllegalStateException("Invalid repository data");
                            }
                            w10 w10Var = y10Var.b;
                            if (w10Var != null && (str2 = w10Var.a) != null) {
                                GitObjectType.Companion.getClass();
                                gitObjectType2 = yz0.s1.a(str2);
                                break;
                            }
                            gitObjectType2 = GitObjectType.UNKNOWN__;
                            yz0.r1 r1Var2 = new yz0.r1(gitObjectType2, y10Var.a, str8, str9, y10Var.c != null);
                            k2Var.v = 1;
                            if (this.s.c(r1Var2, k2Var) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                k2Var = new t00.k2(this, cVar);
                Object obj72 = k2Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = k2Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof vb0.w1) {
                    w1Var = (vb0.w1) cVar;
                    int i16 = w1Var.v;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        w1Var.v = i16 - Integer.MIN_VALUE;
                        Object obj8 = w1Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = w1Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj8);
                            ru ruVar = (ru) obj;
                            k71.k.g(ruVar, "<this>");
                            String str10 = this.t;
                            k71.k.g(str10, "branchOrCommitName");
                            String str11 = this.u;
                            k71.k.g(str11, "path");
                            uu uuVar = ruVar.a;
                            if (uuVar == null) {
                                throw new IllegalStateException("Invalid repository data");
                            }
                            su suVar = uuVar.b;
                            if (suVar != null && (str3 = suVar.a) != null) {
                                GitObjectType.Companion.getClass();
                                gitObjectType3 = yz0.s1.a(str3);
                                break;
                            }
                            gitObjectType3 = GitObjectType.UNKNOWN__;
                            yz0.r1 r1Var3 = new yz0.r1(gitObjectType3, uuVar.a, str10, str11, uuVar.c != null);
                            w1Var.v = 1;
                            if (this.s.c(r1Var3, w1Var) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                w1Var = new vb0.w1(this, cVar);
                Object obj82 = w1Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = w1Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof vb0.u3) {
                    u3Var = (vb0.u3) cVar;
                    int i17 = u3Var.v;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        u3Var.v = i17 - Integer.MIN_VALUE;
                        Object obj9 = u3Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = u3Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj9);
                            aw awVar = (aw) obj;
                            cw cwVar = awVar.a;
                            String str12 = null;
                            List list3 = (cwVar == null || (dVar6 = cwVar.a.b) == null) ? null : dVar6.b.b;
                            if (list3 == null) {
                                list3 = x61.rShadow.r;
                            }
                            ArrayList S3 = x61.m.S(list3);
                            ArrayList arrayList3 = new ArrayList(x61.n.F(S3, 10));
                            int size3 = S3.size();
                            int i18 = 0;
                            while (i18 < size3) {
                                Object obj10 = S3.get(i18);
                                i18++;
                                arrayList3.add(sy.w.a(this.t, this.u, ((v70.a) obj10).c));
                            }
                            cw cwVar2 = awVar.a;
                            boolean z2 = (cwVar2 == null || (dVar5 = cwVar2.a.b) == null) ? false : dVar5.b.a.a;
                            if (cwVar2 != null && (dVar4 = cwVar2.a.b) != null) {
                                str12 = dVar4.b.a.b;
                            }
                            w61.k kVar3 = new w61.k(arrayList3, new x01.i(str12, z2, false));
                            u3Var.v = 1;
                            if (this.s.c(kVar3, u3Var) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                u3Var = new vb0.u3(this, cVar);
                Object obj92 = u3Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = u3Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof vb0.v3) {
                    v3Var = (vb0.v3) cVar;
                    int i19 = v3Var.v;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        v3Var.v = i19 - Integer.MIN_VALUE;
                        Object obj11 = v3Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = v3Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj11);
                            u10.fw fwVar2 = (u10.fw) obj;
                            u10.gw gwVar2 = fwVar2.a;
                            List list4 = gwVar2 != null ? gwVar2.c.b.b : null;
                            if (list4 == null) {
                                list4 = x61.rShadow.r;
                            }
                            ArrayList S4 = x61.m.S(list4);
                            ArrayList arrayList4 = new ArrayList(x61.n.F(S4, 10));
                            int size4 = S4.size();
                            int i20 = 0;
                            while (i20 < size4) {
                                Object obj12 = S4.get(i20);
                                i20++;
                                arrayList4.add(sy.w.a(this.t, this.u, ((v70.a) obj12).c));
                            }
                            u10.gw gwVar3 = fwVar2.a;
                            w61.k kVar4 = new w61.k(arrayList4, new x01.i(gwVar3 != null ? gwVar3.c.b.a.b : null, gwVar3 != null ? gwVar3.c.b.a.a : false, false));
                            v3Var.v = 1;
                            if (this.s.c(kVar4, v3Var) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                v3Var = new vb0.v3(this, cVar);
                Object obj112 = v3Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = v3Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof wy0.c2) {
                    c2Var = (wy0.c2) cVar;
                    int i22 = c2Var.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        c2Var.v = i22 - Integer.MIN_VALUE;
                        Object obj13 = c2Var.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = c2Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj13);
                            vz vzVar = (vz) obj;
                            k71.k.g(vzVar, "<this>");
                            String str13 = this.t;
                            k71.k.g(str13, "branchOrCommitName");
                            String str14 = this.u;
                            k71.k.g(str14, "path");
                            yz yzVar = vzVar.a;
                            if (yzVar == null) {
                                throw new IllegalStateException("Invalid repository data");
                            }
                            wz wzVar = yzVar.b;
                            if (wzVar != null && (str4 = wzVar.a) != null) {
                                GitObjectType.Companion.getClass();
                                gitObjectType4 = yz0.s1.a(str4);
                                break;
                            }
                            gitObjectType4 = GitObjectType.UNKNOWN__;
                            yz0.r1 r1Var4 = new yz0.r1(gitObjectType4, yzVar.a, str13, str14, yzVar.c != null);
                            c2Var.v = 1;
                            if (this.s.c(r1Var4, c2Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                c2Var = new wy0.c2(this, cVar);
                Object obj132 = c2Var.u;
                b71.a aVar92 = b71.a.r;
                i8 = c2Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
        }
    }
}
