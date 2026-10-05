package sy;

import a5.q0;
import android.graphics.Color;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceInfoResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse$FileReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse$RepositoryReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse$UnknownReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceResponse$WebSearchReferenceResponse;
import com.github.service.dotcom.models.response.copilot.serialization.WebSearchReferenceResultResponse;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.type.CommentAuthorAssociation;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.google.android.gms.internal.measurement.i4;
import dw.h3;
import dw.j3;
import dw.l3;
import dw.m3;
import dw.o5;
import gn0.bm;
import is.g0;
import is.i1;
import is.p0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jo.re;
import jo.se;
import kotlin.NoWhenBranchMatchedException;
import m10.n40;
import m10.zd;
import xn.h0;
import xn.h4;
import xn.j0;
import xn.k0;
import xn.l0;
import xn.m0;
import xn.n0;
import xn.o0;
import yz0.b2;
import yz0.b8;
import yz0.g4;
import yz0.q3;
import yz0.r3;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f0 {
    public static final r3 a(r3 r3Var) {
        k71.k.g(r3Var, "<this>");
        return r3.a(r3Var, r3Var.c + 1, true);
    }

    public static final ArrayList b(i30.i iVar) {
        List list = iVar != null ? iVar.b.c : null;
        if (list == null) {
            list = x61.r.r;
        }
        ArrayList S = x61.m.S(list);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            i30.h hVar = (i30.h) obj;
            String str = hVar.d;
            Avatar q = t.q.q(hVar.e);
            String str2 = hVar.b;
            String str3 = hVar.c;
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(new b2(str, q, str2, str3, false, false, 112));
        }
        return arrayList;
    }

    public static final ArrayList c(List list) {
        l0 l0Var;
        n0 n0Var;
        o0 o0Var;
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.github.service.dotcom.models.response.copilot.serialization.a aVar = (com.github.service.dotcom.models.response.copilot.serialization.a) it.next();
            if (aVar instanceof ChatMessageReferenceResponse$FileReferenceResponse) {
                ChatMessageReferenceResponse$FileReferenceResponse chatMessageReferenceResponse$FileReferenceResponse = (ChatMessageReferenceResponse$FileReferenceResponse) aVar;
                int i = chatMessageReferenceResponse$FileReferenceResponse.a;
                String str = chatMessageReferenceResponse$FileReferenceResponse.b;
                String str2 = chatMessageReferenceResponse$FileReferenceResponse.c;
                l0Var = new h0(i, str, str2, chatMessageReferenceResponse$FileReferenceResponse.d, chatMessageReferenceResponse$FileReferenceResponse.e, chatMessageReferenceResponse$FileReferenceResponse.f, chatMessageReferenceResponse$FileReferenceResponse.g, str, str2, null, null);
            } else if (aVar instanceof ChatMessageReferenceResponse$RepositoryReferenceResponse) {
                ChatMessageReferenceResponse$RepositoryReferenceResponse chatMessageReferenceResponse$RepositoryReferenceResponse = (ChatMessageReferenceResponse$RepositoryReferenceResponse) aVar;
                int i2 = chatMessageReferenceResponse$RepositoryReferenceResponse.a;
                String str3 = chatMessageReferenceResponse$RepositoryReferenceResponse.b;
                String str4 = chatMessageReferenceResponse$RepositoryReferenceResponse.c;
                int ordinal = chatMessageReferenceResponse$RepositoryReferenceResponse.d.ordinal();
                if (ordinal == 0) {
                    n0Var = n0.r;
                } else if (ordinal == 1) {
                    n0Var = n0.s;
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n0Var = n0.t;
                }
                String str5 = chatMessageReferenceResponse$RepositoryReferenceResponse.e;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = chatMessageReferenceResponse$RepositoryReferenceResponse.f;
                String str7 = str6 != null ? str6 : "";
                String str8 = chatMessageReferenceResponse$RepositoryReferenceResponse.g;
                String str9 = str5;
                String str10 = str7;
                String str11 = chatMessageReferenceResponse$RepositoryReferenceResponse.h;
                ChatMessageReferenceInfoResponse chatMessageReferenceInfoResponse = chatMessageReferenceResponse$RepositoryReferenceResponse.i;
                m0 m0Var = new m0(chatMessageReferenceInfoResponse.a, chatMessageReferenceInfoResponse.b);
                int ordinal2 = chatMessageReferenceResponse$RepositoryReferenceResponse.j.ordinal();
                if (ordinal2 == 0) {
                    o0Var = o0.r;
                } else if (ordinal2 == 1) {
                    o0Var = o0.s;
                } else {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o0Var = o0.t;
                }
                l0Var = new j0(i2, str3, str4, n0Var, str9, str10, str8, str11, m0Var, o0Var, null, str4, str3, n0Var == n0.r);
            } else if (aVar instanceof ChatMessageReferenceResponse$WebSearchReferenceResponse) {
                ChatMessageReferenceResponse$WebSearchReferenceResponse chatMessageReferenceResponse$WebSearchReferenceResponse = (ChatMessageReferenceResponse$WebSearchReferenceResponse) aVar;
                String str12 = chatMessageReferenceResponse$WebSearchReferenceResponse.a;
                String str13 = chatMessageReferenceResponse$WebSearchReferenceResponse.b;
                List<WebSearchReferenceResultResponse> list2 = chatMessageReferenceResponse$WebSearchReferenceResponse.c;
                ArrayList arrayList2 = new ArrayList(x61.n.F(list2, 10));
                for (WebSearchReferenceResultResponse webSearchReferenceResultResponse : list2) {
                    arrayList2.add(new h4(webSearchReferenceResultResponse.a, webSearchReferenceResultResponse.b, webSearchReferenceResultResponse.c));
                }
                l0Var = new k0(str12, str13, arrayList2, "", "", null, null);
            } else {
                if (!(aVar instanceof ChatMessageReferenceResponse$UnknownReferenceResponse)) {
                    throw new NoWhenBranchMatchedException();
                }
                l0Var = null;
            }
            if (l0Var != null) {
                arrayList.add(l0Var);
            }
        }
        return arrayList;
    }

    public static final b01.b d(p0 p0Var) {
        n40 n40Var;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        ZonedDateTime zonedDateTime;
        String str;
        com.github.service.models.response.a aVar;
        b01.c cVar;
        b8 b8Var;
        List list;
        int i3;
        String str2;
        b01.k kVar;
        boolean z4;
        String str3;
        ArrayList arrayList;
        List list2;
        int i4;
        String str4;
        Iterator it;
        String str5;
        b01.l lVar;
        b01.g c;
        ms.g gVar;
        k71.k.g(p0Var, "<this>");
        g0 g0Var = p0Var.o;
        is.o0 o0Var = p0Var.m;
        n40 n40Var2 = o0Var.d;
        String str6 = p0Var.b;
        String str7 = p0Var.c;
        is.h0 h0Var = p0Var.q;
        com.github.service.models.response.a e = v8.l0.e(h0Var != null ? h0Var.c : null);
        String str8 = o0Var.a;
        String str9 = o0Var.b;
        is.l0 l0Var = o0Var.c;
        String str10 = l0Var.a;
        String str11 = l0Var.b;
        boolean z5 = p0Var.h;
        int i5 = n40Var2 == null ? -1 : kz.a.a[n40Var2.ordinal()];
        boolean z6 = i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4;
        boolean z7 = p0Var.i;
        if (n40Var2 == null) {
            n40Var = n40Var2;
            i = -1;
        } else {
            n40Var = n40Var2;
            i = kz.a.a[n40Var2.ordinal()];
        }
        if (i == 1 || i == 2 || i == 3) {
            z = z6;
            z2 = z7;
            z3 = true;
        } else {
            z = z6;
            z2 = z7;
            z3 = false;
        }
        boolean z8 = (n40Var == null ? -1 : kz.a.a[n40Var.ordinal()]) == 1;
        b01.e d = a0.d(p0Var.p.c);
        ZonedDateTime zonedDateTime2 = p0Var.d;
        ZonedDateTime zonedDateTime3 = p0Var.e;
        boolean z9 = g0Var != null;
        ZonedDateTime zonedDateTime4 = p0Var.f;
        int i6 = p0Var.g;
        if (g0Var != null) {
            i2 = i6;
            zonedDateTime = zonedDateTime2;
            String str12 = g0Var.b;
            str = str7;
            ms.i iVar = g0Var.d;
            aVar = e;
            ar.c cVar2 = iVar.j;
            String str13 = iVar.c;
            pv.c cVar3 = iVar.n;
            ju.a aVar2 = iVar.l;
            boolean z11 = iVar.d;
            boolean z12 = iVar.e;
            boolean z13 = iVar.f;
            boolean z14 = iVar.g;
            ms.h hVar = iVar.i;
            String str14 = (hVar == null || (gVar = hVar.c) == null) ? null : gVar.b;
            i1 i1Var = iVar.m;
            pu.a aVar3 = iVar.k;
            c = d0.c(cVar2, str13, cVar3, (r32 & 4) != 0 ? null : aVar2, null, z11, z12, z13, (r32 & 128) != 0 ? false : z14, (r32 & 256) != 0 ? null : str14, false, x61.r.r, i1Var, (r32 & 4096) != 0 ? false : aVar3.b, (r32 & 8192) != 0 ? false : aVar3.c, d0.E(iVar));
            is.n0 n0Var = g0Var.c;
            cVar = new b01.c(str12, c, n0Var != null ? n0Var.a : null);
        } else {
            i2 = i6;
            zonedDateTime = zonedDateTime2;
            str = str7;
            aVar = e;
            cVar = null;
        }
        String str15 = p0Var.l;
        int i7 = p0Var.r.a;
        i1 i1Var2 = p0Var.u;
        b01.c cVar4 = cVar;
        b8 b8Var2 = new b8(i1Var2.d, str6, p0Var.j, i1Var2.c);
        List P = i4.P(p0Var.t);
        is.m0 m0Var = p0Var.s;
        if (m0Var != null) {
            os.i iVar2 = m0Var.c;
            String str16 = iVar2.a;
            b8Var = b8Var2;
            String str17 = iVar2.b;
            boolean z15 = iVar2.c;
            int i8 = iVar2.d;
            boolean z16 = iVar2.e;
            os.h hVar2 = iVar2.f;
            if (hVar2 == null || (list2 = hVar2.a) == null) {
                z4 = z16;
                list = P;
                i3 = i7;
                str2 = str6;
                str3 = str16;
                arrayList = x61.r.r;
            } else {
                z4 = z16;
                arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    List list3 = P;
                    os.g gVar2 = (os.g) it2.next();
                    if (gVar2 != null) {
                        qs.a aVar4 = gVar2.c;
                        i4 = i7;
                        str4 = str6;
                        it = it2;
                        str5 = str16;
                        lVar = new b01.l(aVar4.d, aVar4.a, aVar4.b, aVar4.c);
                    } else {
                        i4 = i7;
                        str4 = str6;
                        it = it2;
                        str5 = str16;
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                    it2 = it;
                    str16 = str5;
                    P = list3;
                    i7 = i4;
                    str6 = str4;
                }
                list = P;
                i3 = i7;
                str2 = str6;
                str3 = str16;
            }
            kVar = new b01.k(str3, str17, z15, i8, z4, arrayList);
        } else {
            b8Var = b8Var2;
            list = P;
            i3 = i7;
            str2 = str6;
            kVar = null;
        }
        r01.a aVar5 = CommentAuthorAssociation.Companion;
        String str18 = p0Var.k.r;
        aVar5.getClass();
        return new b01.b(str2, str, aVar, str8, str9, str10, str11, z5, z, z2, z3, z8, d, zonedDateTime, zonedDateTime3, z9, zonedDateTime4, i2, cVar4, str15, i3, b8Var, list, kVar, r01.a.a(str18), o0Var.e, e(p0Var.v));
    }

    public static final b01.f e(is.k kVar) {
        boolean z = kVar.b;
        boolean z2 = kVar.c;
        boolean z3 = kVar.d;
        ZonedDateTime zonedDateTime = kVar.e;
        zd zdVar = kVar.f;
        return new b01.f(z, z2, z3, zonedDateTime, zdVar != null ? w.y(zdVar) : null);
    }

    public static final g4 f(i90.f fVar) {
        i90.c cVar;
        i90.e eVar;
        List list;
        i90.b bVar;
        boolean z = fVar.a;
        String str = fVar.c;
        String str2 = fVar.d;
        List list2 = fVar.h.a;
        return new g4(z, str, str2, (list2 == null || (cVar = (i90.c) x61.m.W(list2)) == null || (eVar = cVar.a) == null || (list = eVar.a) == null || (bVar = (i90.b) x61.m.f0(list)) == null) ? null : t.a0.I(bVar.b), fVar.e, fVar.f, t.a0.O(fVar.g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.time.ZonedDateTime] */
    public static final ZonedDateTime g(String str) {
        ZonedDateTime zonedDateTime;
        k71.k.g(str, "<this>");
        if (str.length() <= 0) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
            k71.k.d(now);
            return now;
        }
        try {
            zonedDateTime = ZonedDateTime.parse(str, DateTimeFormatter.ISO_ZONED_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault());
        } catch (Exception unused) {
            zonedDateTime = ZonedDateTime.now(ZoneId.systemDefault());
        }
        k71.k.d(zonedDateTime);
        return zonedDateTime;
    }

    public static y61.g h(y61.g gVar) {
        y61.e eVar = gVar.r;
        eVar.b();
        return eVar.z > 0 ? gVar : y61.g.s;
    }

    public static final boolean i(ArrayList arrayList) {
        x61.r rVar;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                rVar = x61.r.r;
            } else {
                x61.r arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int m = d0.m(arrayList);
                int i = 0;
                while (i < m) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    d3.t tVar = (d3.t) obj2;
                    d3.t tVar2 = (d3.t) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (tVar2.g().c() >> 32)) - Float.intBitsToFloat((int) (tVar.g().c() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (tVar2.g().c() & 4294967295L)) - Float.intBitsToFloat((int) (tVar.g().c() & 4294967295L)));
                    arrayList2.add(new c2.b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                rVar = arrayList2;
            }
            if (rVar.size() == 1) {
                j = ((c2.b) x61.m.U(rVar)).a;
            } else {
                if (rVar.isEmpty()) {
                    u3.a.c("Empty collection can't be reduced.");
                }
                Object U = x61.m.U(rVar);
                int m2 = d0.m(rVar);
                if (1 <= m2) {
                    int i2 = 1;
                    while (true) {
                        U = new c2.b(c2.b.f(((c2.b) U).a, ((c2.b) rVar.get(i2)).a));
                        if (i2 == m2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((c2.b) U).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static HashSet j(Object... objArr) {
        HashSet hashSet = new HashSet(x61.x.s(objArr.length));
        x61.l.a0(objArr, hashSet);
        return hashSet;
    }

    public static LinkedHashSet k(Set set, Object obj) {
        k71.k.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x61.x.s(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && k71.k.b(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set l(Set set, Iterable iterable) {
        k71.k.g(set, "<this>");
        k71.k.g(iterable, "elements");
        Collection<?> O = x61.m.O(iterable);
        if (O.isEmpty()) {
            return x61.m.K0(set);
        }
        if (!(O instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(O);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) O).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet m(Set set, Iterable iterable) {
        k71.k.g(set, "<this>");
        k71.k.g(iterable, "elements");
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(x61.x.s(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        x61.m.J(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet n(Set set, Object obj) {
        k71.k.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x61.x.s(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static androidx.emoji2.text.flatbuffer.b o(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    androidx.emoji2.text.flatbuffer.b bVar = new androidx.emoji2.text.flatbuffer.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    ((q0) bVar).u = duplicate;
                    ((q0) bVar).r = position;
                    int i6 = position - duplicate.getInt(position);
                    ((q0) bVar).s = i6;
                    ((q0) bVar).t = ((ByteBuffer) ((q0) bVar).u).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final r3 p(r3 r3Var) {
        k71.k.g(r3Var, "<this>");
        return r3.a(r3Var, Math.max(r3Var.c - 1, 0), false);
    }

    public static final void q(b5.f fVar, d3.t tVar) {
        Object g = tVar.k().r.g(d3.x.g);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            throw new ClassCastException();
        }
        d3.t l = tVar.l();
        if (l == null) {
            return;
        }
        Object g2 = l.k().r.g(d3.x.e);
        if (g2 == null) {
            g2 = null;
        }
        if (g2 != null) {
            Object g3 = l.k().r.g(d3.x.f);
            d3.d dVar = (d3.d) (g3 != null ? g3 : null);
            if (dVar == null || (dVar.a >= 0 && dVar.b >= 0)) {
                if (tVar.k().r.c(d3.x.I)) {
                    ArrayList arrayList = new ArrayList();
                    List j = d3.t.j(4, l);
                    int size = j.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        d3.t tVar2 = (d3.t) j.get(i2);
                        if (tVar2.k().r.c(d3.x.I)) {
                            arrayList.add(tVar2);
                            if (tVar2.c.x() < tVar.c.x()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean i3 = i(arrayList);
                    int i4 = i3 ? 0 : i;
                    int i5 = i3 ? i : 0;
                    Object g4 = tVar.k().r.g(d3.x.I);
                    if (g4 == null) {
                        g4 = Boolean.FALSE;
                    }
                    fVar.l(b5.e.b(i4, 1, i5, 1, false, ((Boolean) g4).booleanValue()));
                }
            }
        }
    }

    public static Set r(Object obj) {
        Set singleton = Collections.singleton(obj);
        k71.k.f(singleton, "singleton(...)");
        return singleton;
    }

    public static final bm s(PullRequestMergeMethod pullRequestMergeMethod) {
        k71.k.g(pullRequestMergeMethod, "<this>");
        int i = vl0.g.a[pullRequestMergeMethod.ordinal()];
        if (i == 1) {
            return bm.w;
        }
        if (i == 2) {
            return bm.t;
        }
        if (i == 3) {
            return bm.v;
        }
        if (i == 4) {
            return bm.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList t(re reVar) {
        String str;
        int i;
        x61.r rVar;
        x61.r rVar2;
        k71.k.g(reVar, "<this>");
        x61.r rVar3 = reVar.a;
        x61.r rVar4 = x61.r.r;
        if (rVar3 == null) {
            rVar3 = rVar4;
        }
        ArrayList S = x61.m.S(rVar3);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = S.get(i2);
            i2++;
            se seVar = (se) obj;
            m3 m3Var = seVar.e;
            int i3 = seVar.c;
            int i4 = seVar.b;
            String str2 = m3Var.c;
            l3 l3Var = m3Var.i;
            j3 j3Var = m3Var.h;
            com.github.service.models.response.a aVar = new com.github.service.models.response.a(j3Var.c, w8.s.A(j3Var.d), (String) null, false, (String) null, 60);
            String str3 = m3Var.d;
            if (l3Var != null) {
                try {
                    str = l3Var.a;
                } catch (Exception unused) {
                    i = -16777216;
                }
            } else {
                str = null;
            }
            i = Color.parseColor(str);
            String str4 = l3Var != null ? l3Var.b : null;
            int i5 = i;
            String str5 = m3Var.b;
            o5 o5Var = m3Var.r;
            String str6 = str4;
            boolean z = o5Var.d;
            int i6 = o5Var.c;
            ArrayList arrayList2 = S;
            String str7 = (m3Var.j || m3Var.l) ? m3Var.k : null;
            String str8 = m3Var.e;
            List<h3> list = m3Var.q.a;
            if (list != null) {
                x61.r arrayList3 = new ArrayList();
                for (h3 h3Var : list) {
                    x61.r rVar5 = rVar4;
                    String str9 = h3Var != null ? h3Var.b : null;
                    if (str9 != null) {
                        arrayList3.add(str9);
                    }
                    rVar4 = rVar5;
                }
                rVar = rVar4;
                rVar2 = arrayList3;
            } else {
                rVar = rVar4;
                rVar2 = rVar;
            }
            arrayList.add(new d01.d(str2, aVar, str3, i5, str6, str5, z, i6, str7, i3, str8, rVar2, i4));
            S = arrayList2;
            rVar4 = rVar;
        }
        return arrayList;
    }

    public static final List u(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(x61.m.U(list)) : x61.r.r;
    }

    public static final Map v(Map map) {
        int size = map.size();
        if (size == 0) {
            return x61.s.r;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) x61.m.T(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final PullRequestMergeMethod w(bm bmVar) {
        k71.k.g(bmVar, "<this>");
        int ordinal = bmVar.ordinal();
        if (ordinal == 0) {
            return PullRequestMergeMethod.MERGE;
        }
        if (ordinal == 1) {
            return PullRequestMergeMethod.REBASE;
        }
        if (ordinal == 2) {
            return PullRequestMergeMethod.SQUASH;
        }
        if (ordinal == 3) {
            return PullRequestMergeMethod.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList x(Iterable iterable, r3 r3Var) {
        ArrayList arrayList = new ArrayList(x61.n.F(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            r3 r3Var2 = (q3) it.next();
            if (r3Var2.getId() == r3Var.e) {
                r3Var2 = r3Var;
            } else if (r3Var2 instanceof yz0.b) {
                ArrayList x = x(((yz0.b) r3Var2).a, r3Var);
                ArrayList arrayList2 = new ArrayList();
                int size = x.size();
                int i = 0;
                while (i < size) {
                    Object obj = x.get(i);
                    i++;
                    if (obj instanceof r3) {
                        arrayList2.add(obj);
                    }
                }
                r3Var2 = new yz0.b(arrayList2);
            }
            arrayList.add(r3Var2);
        }
        return x61.m.H0(arrayList);
    }

    public static final List y(Iterable iterable, r3 r3Var) {
        k71.k.g(iterable, "<this>");
        List I0 = x61.m.I0(x(iterable, r3Var));
        int i = r3Var.c;
        if (i == 0 && !r3Var.d) {
            ((ArrayList) I0).remove(r3Var);
            return I0;
        }
        if (i == 1 && r3Var.d) {
            ((ArrayList) I0).add(r3Var);
        }
        return I0;
    }
}
