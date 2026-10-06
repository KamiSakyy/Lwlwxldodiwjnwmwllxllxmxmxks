package sy;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.WorkflowRunEvent;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.CommentAuthorAssociation;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.MinimizedStateReason;
import com.google.android.gms.internal.measurement.z3;
import d1.j1;
import dw.a6;
import dw.c6;
import dw.d6;
import dw.e6;
import dw.o6;
import dw.r6;
import dw.w5;
import dw.x5;
import dw.z5;
import e50.d1;
import e50.h0;
import e50.i0;
import e50.j0;
import e50.k0;
import e50.l0;
import gn0.c20;
import gn0.l2;
import gn0.yv;
import hc0.i9;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import yz0.b8;
import yz0.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t {
    public static final t71.l a(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new t71.l(matcher, charSequence);
        }
        return null;
    }

    public static final b01.b b(l0 l0Var) {
        Enum r22;
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
        b01.kShadow kVar;
        boolean z4;
        String str3;
        ArrayList arrayList;
        List list2;
        int i4;
        String str4;
        Iterator it;
        String str5;
        b01.l lVar;
        b01.g d;
        i50.f fVar;
        k71.k.g(l0Var, "<this>");
        e50.c0 c0Var = l0Var.o;
        k0 k0Var = l0Var.m;
        Enum r3 = k0Var.d;
        String str6 = l0Var.b;
        String str7 = l0Var.c;
        e50.d0 d0Var = l0Var.q;
        com.github.service.models.response.a c = t.e.c(d0Var != null ? d0Var.c : null);
        String str8 = k0Var.a;
        String str9 = k0Var.b;
        h0 h0Var = k0Var.c;
        String str10 = h0Var.a;
        String str11 = h0Var.b;
        boolean z5 = l0Var.h;
        int i5 = r3 == null ? -1 : eb0.a.a[r3.ordinal()];
        boolean z6 = i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4;
        boolean z7 = l0Var.i;
        if (r3 == null) {
            r22 = r3;
            i = -1;
        } else {
            r22 = r3;
            i = eb0.a.a[r3.ordinal()];
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
        boolean z8 = (r22 == null ? -1 : eb0.a.a[r22.ordinal()]) == 1;
        b01.e b = p.b(l0Var.p.c);
        ZonedDateTime zonedDateTime2 = l0Var.d;
        ZonedDateTime zonedDateTime3 = l0Var.e;
        boolean z9 = c0Var != null;
        ZonedDateTime zonedDateTime4 = l0Var.f;
        int i6 = l0Var.g;
        if (c0Var != null) {
            i2 = i6;
            zonedDateTime = zonedDateTime2;
            String str12 = c0Var.b;
            str = str7;
            i50.h hVar = c0Var.d;
            aVar = c;
            c40.c cVar2 = hVar.j;
            String str13 = hVar.c;
            i80.c cVar3 = hVar.n;
            y60.a aVar2 = hVar.l;
            boolean z11 = hVar.d;
            boolean z12 = hVar.e;
            boolean z13 = hVar.f;
            boolean z14 = hVar.g;
            i50.g gVar = hVar.i;
            String str14 = (gVar == null || (fVar = gVar.c) == null) ? null : fVar.b;
            d1 d1Var = hVar.m;
            g70.a aVar3 = hVar.k;
            d = r.d(cVar2, str13, cVar3, (r32 & 4) != 0 ? null : aVar2, null, z11, z12, z13, (r32 & 128) != 0 ? false : z14, (r32 & 256) != 0 ? null : str14, false, x61.r.r, d1Var, (r32 & 4096) != 0 ? false : aVar3.b, (r32 & 8192) != 0 ? false : aVar3.c, r.A(hVar));
            j0 j0Var = c0Var.c;
            cVar = new b01.c(str12, d, j0Var != null ? j0Var.a : null);
        } else {
            i2 = i6;
            zonedDateTime = zonedDateTime2;
            str = str7;
            aVar = c;
            cVar = null;
        }
        String str15 = l0Var.l;
        int i7 = l0Var.r.a;
        d1 d1Var2 = l0Var.u;
        b01.c cVar4 = cVar;
        b8 b8Var2 = new b8(d1Var2.d, str6, l0Var.j, d1Var2.c);
        List c2 = p.c(l0Var.t);
        i0 i0Var = l0Var.s;
        if (i0Var != null) {
            k50.h hVar2 = i0Var.c;
            String str16 = hVar2.a;
            b8Var = b8Var2;
            String str17 = hVar2.b;
            boolean z15 = hVar2.c;
            int i8 = hVar2.d;
            boolean z16 = hVar2.e;
            k50.g gVar2 = hVar2.f;
            if (gVar2 == null || (list2 = gVar2.a) == null) {
                z4 = z16;
                list = c2;
                i3 = i7;
                str2 = str6;
                str3 = str16;
                arrayList = x61.r.r;
            } else {
                z4 = z16;
                arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    List list3 = c2;
                    k50.f fVar2 = (k50.f) it2.next();
                    if (fVar2 != null) {
                        m50.a aVar4 = fVar2.c;
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
                    c2 = list3;
                    i7 = i4;
                    str6 = str4;
                }
                list = c2;
                i3 = i7;
                str2 = str6;
                str3 = str16;
            }
            kVar = new b01.k(str3, str17, z15, i8, z4, arrayList);
        } else {
            b8Var = b8Var2;
            list = c2;
            i3 = i7;
            str2 = str6;
            kVar = null;
        }
        r01.a aVar5 = CommentAuthorAssociation.Companion;
        String str18 = l0Var.k.r;
        aVar5.getClass();
        return new b01.b(str2, str, aVar, str8, str9, str10, str11, z5, z, z2, z3, z8, b, zonedDateTime, zonedDateTime3, z9, zonedDateTime4, i2, cVar4, str15, i3, b8Var, list, kVar, r01.a.a(str18), k0Var.e, c(l0Var.v));
    }

    public static final b01.f c(e50.j jVar) {
        boolean z = jVar.b;
        boolean z2 = jVar.c;
        boolean z3 = jVar.d;
        ZonedDateTime zonedDateTime = jVar.e;
        i9 i9Var = jVar.f;
        return new b01.f(z, z2, z3, zonedDateTime, i9Var != null ? o.m(i9Var) : null);
    }

    public static final x2 d(y60.a aVar) {
        k71.k.g(aVar, "<this>");
        boolean z = aVar.b;
        boolean z2 = aVar.d;
        r01.h hVar = MinimizedStateReason.Companion;
        String str = aVar.c;
        hVar.getClass();
        return new x2(z, z, z2, r01.h.a(str));
    }

    public static final List e(r6 r6Var) {
        ArrayList arrayList;
        k71.k.g(r6Var, "<this>");
        List<o6> list = r6Var.b.b;
        ArrayList arrayList2 = x61.r.r;
        if (list == null) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (o6 o6Var : list) {
            if (o6Var != null) {
                e6 e6Var = o6Var.c;
                w5 w5Var = e6Var.f;
                String str = e6Var.b;
                String str2 = e6Var.c;
                int i = e6Var.d;
                z5 z5Var = e6Var.i;
                IssueType f = z5Var != null ? z3.f(z5Var.c) : null;
                CloseReason w = w.w(e6Var.h);
                List<a6> list2 = w5Var.b;
                if (list2 != null) {
                    arrayList = new ArrayList(x61.n.F(list2, 10));
                    for (a6 a6Var : list2) {
                        arrayList.add(v8.l0.e(a6Var != null ? a6Var.b : null));
                    }
                } else {
                    arrayList = arrayList2;
                }
                com.github.rudroid.common.b0 b0Var = new com.github.rudroid.common.b0(w5Var.a, arrayList);
                x5 x5Var = e6Var.g;
                int i2 = x5Var != null ? x5Var.a : 0;
                IssueState O = i21.a.O(e6Var.e);
                d6 d6Var = e6Var.j;
                String str3 = d6Var.c.b;
                String str4 = d6Var.b;
                h01.p e = u.e(e6Var.m);
                c6 c6Var = e6Var.k;
                r4 = new h01.n(str, str2, i, f, w, b0Var, i2, O, str3, str4, e, c6Var != null ? c6Var.a : null);
            }
            if (r4 != null) {
                arrayList3.add(r4);
            }
        }
        return arrayList3;
    }

    public static j1 f(j71.c... cVarArr) {
        if (cVarArr.length > 0) {
            return new j1(5, cVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int g(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final float h(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static v8.i i(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        int i;
        boolean z;
        k71.k.g(bArr, "bytes");
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bArr.length == 0) {
            return v8.i.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            i = 0;
            z = bArr2[0] == ((byte) 16777132) && bArr2[1] == ((byte) (-21267));
            byteArrayInputStream.reset();
        } catch (IOException unused) {
            int i2 = v8.j.a;
            v8.x.a().getClass();
        } catch (ClassNotFoundException unused2) {
            int i3 = v8.j.a;
            v8.x.a().getClass();
        }
        if (z) {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                while (i < readInt) {
                    linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    i++;
                }
                objectInputStream.close();
                return new v8.i(linkedHashMap);
            } finally {
            }
        } else {
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                short readShort = dataInputStream.readShort();
                if (readShort != -21521) {
                    throw new IllegalStateException(no.a.k("Magic number doesn't match: ", readShort).toString());
                }
                short readShort2 = dataInputStream.readShort();
                if (readShort2 != 1) {
                    throw new IllegalStateException(no.a.k("Unsupported version number: ", readShort2).toString());
                }
                int readInt2 = dataInputStream.readInt();
                while (i < readInt2) {
                    linkedHashMap.put(dataInputStream.readUTF(), j(dataInputStream, dataInputStream.readByte()));
                    i++;
                }
                dataInputStream.close();
                return new v8.i(linkedHashMap);
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable j(DataInputStream dataInputStream, byte b) {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int readInt = dataInputStream.readInt();
            java.lang.Boolean[] r0 = new Boolean[readInt];
            while (i < readInt) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int readInt2 = dataInputStream.readInt();
            Object r02 = new Byte[readInt2];
            while (i < readInt2) {
                r02[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r02;
        }
        if (b == 10) {
            int readInt3 = dataInputStream.readInt();
            Object r03 = new Integer[readInt3];
            while (i < readInt3) {
                r03[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r03;
        }
        if (b == 11) {
            int readInt4 = dataInputStream.readInt();
            Object r04 = new Long[readInt4];
            while (i < readInt4) {
                r04[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r04;
        }
        if (b == 12) {
            int readInt5 = dataInputStream.readInt();
            Object r05 = new Float[readInt5];
            while (i < readInt5) {
                r05[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r05;
        }
        if (b == 13) {
            int readInt6 = dataInputStream.readInt();
            Object r06 = new Double[readInt6];
            while (i < readInt6) {
                r06[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r06;
        }
        if (b != 14) {
            throw new IllegalStateException(no.a.k("Unsupported type ", b));
        }
        int readInt7 = dataInputStream.readInt();
        java.lang.String[] r1 = new String[readInt7];
        while (i < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (k71.k.b(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i] = readUTF;
            i++;
        }
        return r1;
    }

    public static SharedPreferences k(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final float l(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static final int m(int i, float f, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static Comparable n(s3.f fVar, s3.f fVar2) {
        return fVar.compareTo(fVar2) >= 0 ? fVar : fVar2;
    }

    public static final x6.d0 o(j71.c cVar) {
        x6.e0 e0Var = new x6.e0();
        cVar.k(e0Var);
        boolean z = e0Var.b;
        boolean z2 = e0Var.c;
        String str = e0Var.e;
        x6.c0 c0Var = e0Var.a;
        if (str != null) {
            boolean z3 = e0Var.f;
            boolean z4 = e0Var.g;
            c0Var.b = str;
            c0Var.a = -1;
            c0Var.d = z3;
            c0Var.e = z4;
        } else {
            k71.e eVar = e0Var.h;
            if (eVar != null) {
                boolean z5 = e0Var.f;
                boolean z6 = e0Var.g;
                c0Var.c = eVar;
                c0Var.a = -1;
                c0Var.d = z5;
                c0Var.e = z6;
            } else {
                int i = e0Var.d;
                boolean z7 = e0Var.f;
                boolean z8 = e0Var.g;
                c0Var.a = i;
                c0Var.b = null;
                c0Var.d = z7;
                c0Var.e = z8;
            }
        }
        String str2 = c0Var.b;
        if (str2 != null) {
            boolean z9 = c0Var.d;
            boolean z11 = c0Var.e;
            int i2 = c0Var.f;
            int i3 = c0Var.g;
            int i4 = c0Var.h;
            int i5 = c0Var.i;
            int i6 = x6.w.w;
            x6.d0 d0Var = new x6.d0(z, z2, "android-app://androidx.navigation/".concat(str2).hashCode(), z9, z11, i2, i3, i4, i5);
            d0Var.j = str2;
            return d0Var;
        }
        r71.b bVar = c0Var.c;
        if (bVar == null) {
            return new x6.d0(z, z2, c0Var.a, c0Var.d, c0Var.e, c0Var.f, c0Var.g, c0Var.h, c0Var.i);
        }
        x6.d0 d0Var2 = new x6.d0(z, z2, b7.i.b(b91.g.J(bVar)), c0Var.d, c0Var.e, c0Var.f, c0Var.g, c0Var.h, c0Var.i);
        d0Var2.k = bVar;
        return d0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x91.d p(b21.v vVar) {
        x91.d dVar;
        c21.h0 h0Var = j91.a.T;
        k71.k.g(vVar, "iterator");
        int i = vVar.s;
        x91.d n = s.n(vVar);
        if (n != null) {
            b21.v c = n.a.c();
            if (k71.k.b(c.m(), h0Var)) {
                c = c.c();
            }
            x91.d m = s.m(c);
            if (m != null) {
                b21.v vVar2 = m.a;
                dVar = new x91.d(vVar2, x61.m.m0(x61.m.l0(n.b, m.b), new x91.e(new q71.g(i, vVar2.s + 1, 1), j91.a.s)), x61.m.l0(n.c, m.c));
                if (dVar == null) {
                    return dVar;
                }
                x91.d m2 = s.m(vVar);
                if (m2 == null) {
                    return null;
                }
                b21.v vVar3 = m2.a;
                b21.v c2 = vVar3.c();
                if (k71.k.b(c2.m(), h0Var)) {
                    c2 = c2.c();
                }
                if (k71.k.b(c2.m(), j91.a.M) && k71.k.b(c2.r(), j91.a.N)) {
                    vVar3 = c2.c();
                }
                return new x91.d(vVar3, x61.m.m0(m2.b, new x91.e(new q71.g(i, vVar3.s + 1, 1), j91.a.t)), m2.c);
            }
        }
        dVar = null;
        if (dVar == null) {
        }
    }

    public static final mn.m q(vn0.v vVar) {
        vn0.s sVar = vVar.p;
        vn0.t tVar = vVar.q;
        vn0.j jVar = vVar.r;
        vn0.i iVar = vVar.o;
        vn0.u uVar = vVar.s;
        int i = uVar != null ? uVar.a : 0;
        int i2 = iVar != null ? iVar.a : 0;
        int i3 = jVar != null ? jVar.a : 0;
        int i4 = tVar != null ? tVar.a : 0;
        int i5 = sVar != null ? sVar.a : 0;
        vn0.g gVar = vVar.n;
        return new mn.m(uVar != null ? uVar.a : 0, iVar != null ? iVar.a : 0, jVar != null ? jVar.a : 0, tVar != null ? tVar.a : 0, sVar != null ? sVar.a : 0, Math.max((((((gVar != null ? gVar.a : 0) - i5) - i4) - i3) - i2) - i, 0));
    }

    public static byte[] r(v8.i iVar) {
        k71.k.g(iVar, "data");
        HashMap hashMap = iVar.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    s(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                k71.k.d(byteArray);
                return byteArray;
            } finally {
            }
        } catch (IOException unused) {
            int i = v8.j.a;
            v8.x.a().getClass();
            return new byte[0];
        }
    }

    public static final void s(DataOutputStream dataOutputStream, String str, Object obj) {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + k71.x.a(obj.getClass()).c());
            }
            Object[] objArr = (Object[]) obj;
            k71.e a = k71.x.a(objArr.getClass());
            if (a.equals(k71.x.a(Boolean[].class))) {
                i = 8;
            } else if (a.equals(k71.x.a(Byte[].class))) {
                i = 9;
            } else if (a.equals(k71.x.a(Integer[].class))) {
                i = 10;
            } else if (a.equals(k71.x.a(Long[].class))) {
                i = 11;
            } else if (a.equals(k71.x.a(Float[].class))) {
                i = 12;
            } else if (a.equals(k71.x.a(Double[].class))) {
                i = 13;
            } else {
                if (!a.equals(k71.x.a(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + k71.x.a(objArr.getClass()).b());
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final CheckConclusionState t(yv yvVar) {
        int ordinal = yvVar.ordinal();
        if (ordinal == 0) {
            return CheckConclusionState.FAILURE;
        }
        if (ordinal == 1) {
            return null;
        }
        if (ordinal == 2) {
            return CheckConclusionState.FAILURE;
        }
        if (ordinal == 3) {
            return null;
        }
        if (ordinal == 4) {
            return CheckConclusionState.SUCCESS;
        }
        if (ordinal == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CheckConclusionState u(l2 l2Var) {
        switch (l2Var == null ? -1 : vl0.b.a[l2Var.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return CheckConclusionState.ACTION_REQUIRED;
            case 2:
                return CheckConclusionState.CANCELLED;
            case 3:
                return CheckConclusionState.FAILURE;
            case 4:
                return CheckConclusionState.NEUTRAL;
            case 5:
                return CheckConclusionState.SKIPPED;
            case 6:
                return CheckConclusionState.STALE;
            case 7:
                return CheckConclusionState.STARTUP_FAILURE;
            case 8:
                return CheckConclusionState.SUCCESS;
            case 9:
                return CheckConclusionState.TIMED_OUT;
            case 10:
                return CheckConclusionState.UNKNOWN__;
        }
    }

    public static final WorkflowRunEvent v(c20 c20Var) {
        switch (c20Var == null ? -1 : vl0.r.a[c20Var.ordinal()]) {
            case -1:
            case 36:
                return WorkflowRunEvent.UNKNOWN__;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return WorkflowRunEvent.BRANCH_PROTECTION_RULE;
            case 2:
                return WorkflowRunEvent.CHECK_RUN;
            case 3:
                return WorkflowRunEvent.CHECK_SUITE;
            case 4:
                return WorkflowRunEvent.CREATE;
            case 5:
                return WorkflowRunEvent.DELETE;
            case 6:
                return WorkflowRunEvent.DEPLOYMENT;
            case 7:
                return WorkflowRunEvent.DEPLOYMENT_STATUS;
            case 8:
                return WorkflowRunEvent.DISCUSSION;
            case 9:
                return WorkflowRunEvent.DISCUSSION_COMMENT;
            case 10:
                return WorkflowRunEvent.DYNAMIC;
            case 11:
                return WorkflowRunEvent.FORK;
            case 12:
                return WorkflowRunEvent.GOLLUM;
            case 13:
                return WorkflowRunEvent.ISSUES;
            case 14:
                return WorkflowRunEvent.ISSUE_COMMENT;
            case 15:
                return WorkflowRunEvent.LABEL;
            case 16:
                return WorkflowRunEvent.MERGE_GROUP;
            case 17:
                return WorkflowRunEvent.MILESTONE;
            case 18:
                return WorkflowRunEvent.PAGE_BUILD;
            case 19:
                return WorkflowRunEvent.PROJECT;
            case 20:
                return WorkflowRunEvent.PROJECT_CARD;
            case 21:
                return WorkflowRunEvent.PROJECT_COLUMN;
            case 22:
                return WorkflowRunEvent.PUBLIC;
            case 23:
                return WorkflowRunEvent.PULL_REQUEST;
            case 24:
                return WorkflowRunEvent.PULL_REQUEST_REVIEW;
            case 25:
                return WorkflowRunEvent.PULL_REQUEST_REVIEW_COMMENT;
            case 26:
                return WorkflowRunEvent.PULL_REQUEST_TARGET;
            case 27:
                return WorkflowRunEvent.PUSH;
            case 28:
                return WorkflowRunEvent.REGISTRY_PACKAGE;
            case 29:
                return WorkflowRunEvent.RELEASE;
            case 30:
                return WorkflowRunEvent.REPOSITORY_DISPATCH;
            case 31:
                return WorkflowRunEvent.SCHEDULE;
            case 32:
                return WorkflowRunEvent.STATUS;
            case 33:
                return WorkflowRunEvent.WATCH;
            case 34:
                return WorkflowRunEvent.WORKFLOW_DISPATCH;
            case 35:
                return WorkflowRunEvent.WORKFLOW_RUN;
        }
    }

    public static Object g;
    public Object I(Object p1, Object p2, Object p3) { return null; }
    public Object g() { return null; }
    public Object k() { return null; }
    public Object l() { return null; }
    public static Object x() { return null; }
}
