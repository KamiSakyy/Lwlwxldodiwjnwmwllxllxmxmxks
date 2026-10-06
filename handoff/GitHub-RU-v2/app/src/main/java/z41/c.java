package z41;

import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.measurement.internal.x3;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k51.d;
import y41.a0;
import y41.a1;
import y41.a2;
import y41.b0;
import y41.b1;
import y41.b2;
import y41.c0;
import y41.c1;
import y41.c2;
import y41.d0;
import y41.d2;
import y41.e;
import y41.e0;
import y41.e1;
import y41.e2;
import y41.f;
import y41.f0;
import y41.f1;
import y41.f2;
import y41.g;
import y41.g0;
import y41.g1;
import y41.g2;
import y41.h;
import y41.h0;
import y41.h1;
import y41.h2;
import y41.i;
import y41.i0;
import y41.i1;
import y41.i2;
import y41.j;
import y41.j0;
import y41.j1;
import y41.j2;
import y41.k;
import y41.k0;
import y41.k2;
import y41.l;
import y41.l0;
import y41.l2;
import y41.m;
import y41.m0;
import y41.m2;
import y41.n;
import y41.n0;
import y41.n2;
import y41.o;
import y41.o0Shadow;
import y41.o1;
import y41.p;
import y41.p0;
import y41.p1;
import y41.q;
import y41.q0;
import y41.q1;
import y41.r;
import y41.r0;
import y41.r1;
import y41.s;
import y41.s0;
import y41.s1;
import y41.t;
import y41.t0;
import y41.t1;
import y41.u;
import y41.u0;
import y41.u1;
import y41.v;
import y41.v0;
import y41.v1;
import y41.w;
import y41.w0;
import y41.w1;
import y41.xShadow;
import y41.x0;
import y41.x1;
import y41.y;
import y41.y0;
import y41.y1;
import y41.z;
import y41.z0;
import y41.z1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public static final x3 a;

    static {
        d dVar = new d();
        y41.d dVar2 = y41.d.a;
        dVar.a(n2.class, dVar2);
        dVar.a(b0.class, dVar2);
        j jVar = j.a;
        dVar.a(m2.class, jVar);
        dVar.a(j0.class, jVar);
        g gVar = g.a;
        dVar.a(u1.class, gVar);
        dVar.a(k0.class, gVar);
        h hVar = h.a;
        dVar.a(t1.class, hVar);
        dVar.a(l0.class, hVar);
        z zVar = z.a;
        dVar.a(l2.class, zVar);
        dVar.a(j1.class, zVar);
        y yVar = y.a;
        dVar.a(k2.class, yVar);
        dVar.a(i1.class, yVar);
        i iVar = i.a;
        dVar.a(v1.class, iVar);
        dVar.a(n0.class, iVar);
        t tVar = t.a;
        dVar.a(j2.class, tVar);
        dVar.a(p0.class, tVar);
        k kVar = k.a;
        dVar.a(d2.class, kVar);
        dVar.a(q0.class, kVar);
        m mVar = m.a;
        dVar.a(b2.class, mVar);
        dVar.a(r0.class, mVar);
        p pVar = p.a;
        dVar.a(a2.class, pVar);
        dVar.a(v0.class, pVar);
        q qVar = q.a;
        dVar.a(z1.class, qVar);
        dVar.a(x0.class, qVar);
        n nVar = n.a;
        dVar.a(x1.class, nVar);
        dVar.a(t0.class, nVar);
        y41.b bVar = y41.b.a;
        dVar.a(p1.class, bVar);
        dVar.a(d0.class, bVar);
        y41.a aVar = y41.a.a;
        dVar.a(o1.class, aVar);
        dVar.a(e0.class, aVar);
        o oVar = o.a;
        dVar.a(y1.class, oVar);
        dVar.a(u0.class, oVar);
        l lVar = l.a;
        dVar.a(w1.class, lVar);
        dVar.a(s0.class, lVar);
        y41.c cVar = y41.c.a;
        dVar.a(q1.class, cVar);
        dVar.a(f0.class, cVar);
        r rVar = r.a;
        dVar.a(c2.class, rVar);
        dVar.a(z0.class, rVar);
        s sVar = s.a;
        dVar.a(e2.class, sVar);
        dVar.a(b1.class, sVar);
        u uVar = u.a;
        dVar.a(f2.class, uVar);
        dVar.a(c1.class, uVar);
        xShadow xVar = xShadow.a;
        dVar.a(i2.class, xVar);
        dVar.a(g1.class, xVar);
        v vVar = v.a;
        dVar.a(h2.class, vVar);
        dVar.a(e1.class, vVar);
        w wVar = w.a;
        dVar.a(g2.class, wVar);
        dVar.a(f1.class, wVar);
        e eVar = e.a;
        dVar.a(s1.class, eVar);
        dVar.a(g0.class, eVar);
        f fVar = f.a;
        dVar.a(r1.class, fVar);
        dVar.a(h0.class, fVar);
        dVar.d = true;
        a = new x3(29, dVar);
    }

    public static x0 a(JsonReader jsonReader) {
        w0 w0Var = new w0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    w0Var.d = jsonReader.nextLong();
                    w0Var.f = (byte) (w0Var.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    w0Var.b = nextString;
                    break;
                case "pc":
                    w0Var.a = jsonReader.nextLong();
                    w0Var.f = (byte) (w0Var.f | 1);
                    break;
                case "file":
                    w0Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    w0Var.e = jsonReader.nextInt();
                    w0Var.f = (byte) (w0Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return w0Var.a();
    }

    public static f0 b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new f0(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }

    public static d0 c(JsonReader jsonReader) {
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    c0Var.i = d(jsonReader, new m11.r(28));
                    break;
                case "pid":
                    c0Var.a = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 1);
                    break;
                case "pss":
                    c0Var.e = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 8);
                    break;
                case "rss":
                    c0Var.f = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 16);
                    break;
                case "timestamp":
                    c0Var.g = jsonReader.nextLong();
                    c0Var.j = (byte) (c0Var.j | 32);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0Var.b = nextString;
                    break;
                case "reasonCode":
                    c0Var.c = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 2);
                    break;
                case "traceFile":
                    c0Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    c0Var.d = jsonReader.nextInt();
                    c0Var.j = (byte) (c0Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0Var.a();
    }

    public static List d(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static p0 e(JsonReader jsonReader) {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        o0Shadow o0Var = new o0Shadow();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i6 = 2;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    a1 a1Var = new a1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                a1Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                a1Var.b = jsonReader.nextInt();
                                a1Var.g = (byte) (a1Var.g | 1);
                                break;
                            case 2:
                                a1Var.d = jsonReader.nextInt();
                                a1Var.g = (byte) (a1Var.g | 4);
                                break;
                            case 3:
                                a1Var.f = jsonReader.nextLong();
                                a1Var.g = (byte) (a1Var.g | 16);
                                break;
                            case 4:
                                a1Var.e = jsonReader.nextLong();
                                a1Var.g = (byte) (a1Var.g | 8);
                                break;
                            case 5:
                                a1Var.c = jsonReader.nextBoolean();
                                a1Var.g = (byte) (a1Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    o0Var.d = a1Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            List d = d(jsonReader, new a(0));
                            if (d == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list = d;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                    o0Var.f = new g1(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    byte b = 0;
                    int i7 = 0;
                    r0 r0Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    z0 z0Var = null;
                    List list4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    i = 0;
                                    break;
                                }
                                i = -1;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    i = 1;
                                    break;
                                }
                                i = -1;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    i = i6;
                                    break;
                                }
                                i = -1;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    i = 3;
                                    break;
                                }
                                i = -1;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    i = 4;
                                    break;
                                }
                                i = -1;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    i = 5;
                                    break;
                                }
                                i = -1;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    i = 6;
                                    break;
                                }
                                i = -1;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        switch (i) {
                            case 0:
                                i2 = i6;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = Collections.unmodifiableList(arrayList);
                                i6 = i2;
                            case 1:
                                i2 = i6;
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                i6 = i2;
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                t0 t0Var = null;
                                d0 d0Var = null;
                                u0 u0Var = null;
                                List list6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                i3 = 0;
                                                break;
                                            }
                                            i3 = -1;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                i3 = 1;
                                                break;
                                            }
                                            i3 = -1;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                i3 = i6;
                                                break;
                                            }
                                            i3 = -1;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                i3 = 3;
                                                break;
                                            }
                                            i3 = -1;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                i3 = 4;
                                                break;
                                            }
                                            i3 = -1;
                                            break;
                                        default:
                                            i3 = -1;
                                            break;
                                    }
                                    switch (i3) {
                                        case 0:
                                            i4 = i6;
                                            d0Var = c(jsonReader);
                                            i6 = i4;
                                        case 1:
                                            i4 = i6;
                                            list5 = d(jsonReader, new a(1));
                                            i6 = i4;
                                        case 2:
                                            jsonReader.beginObject();
                                            long j = 0;
                                            byte b2 = 0;
                                            String str = null;
                                            String str2 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                int i8 = i6;
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            i5 = 0;
                                                            break;
                                                        }
                                                        i5 = -1;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            i5 = 1;
                                                            break;
                                                        }
                                                        i5 = -1;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            i5 = i8;
                                                            break;
                                                        }
                                                        i5 = -1;
                                                        break;
                                                    default:
                                                        i5 = -1;
                                                        break;
                                                }
                                                switch (i5) {
                                                    case 0:
                                                        b2 = (byte) (b2 | 1);
                                                        j = jsonReader.nextLong();
                                                        break;
                                                    case 1:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        str = jsonReader.nextString();
                                                        if (str == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                                i6 = i8;
                                            }
                                            i4 = i6;
                                            jsonReader.endObject();
                                            if (b2 != 1 || str == null || str2 == null) {
                                                StringBuilder sb = new StringBuilder();
                                                if (str == null) {
                                                    sb.append(" name");
                                                }
                                                if (str2 == null) {
                                                    sb.append(" code");
                                                }
                                                if ((b2 & 1) == 0) {
                                                    sb.append(" address");
                                                }
                                                throw new IllegalStateException(no.a.n("Missing required properties:", sb));
                                            }
                                            u0Var = new u0(j, str, str2);
                                            i6 = i4;
                                            break;
                                        case 3:
                                            list6 = d(jsonReader, new a(i6));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            i4 = i6;
                                            i6 = i4;
                                        case 4:
                                            t0Var = f(jsonReader);
                                            i4 = i6;
                                            i6 = i4;
                                        default:
                                            jsonReader.skipValue();
                                            i4 = i6;
                                            i6 = i4;
                                    }
                                }
                                i2 = i6;
                                jsonReader.endObject();
                                if (u0Var == null || list6 == null) {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (u0Var == null) {
                                        sb2.append(" signal");
                                    }
                                    if (list6 == null) {
                                        sb2.append(" binaries");
                                    }
                                    throw new IllegalStateException(no.a.n("Missing required properties:", sb2));
                                }
                                r0Var = new r0(list5, t0Var, d0Var, u0Var, list6);
                                i6 = i2;
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = Collections.unmodifiableList(arrayList2);
                                i2 = i6;
                                i6 = i2;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = Collections.unmodifiableList(arrayList3);
                                i2 = i6;
                                i6 = i2;
                            case 5:
                                i7 = jsonReader.nextInt();
                                b = (byte) 1;
                                i2 = i6;
                                i6 = i2;
                            case 6:
                                z0Var = g(jsonReader);
                                i2 = i6;
                                i6 = i2;
                            default:
                                jsonReader.skipValue();
                                i2 = i6;
                                i6 = i2;
                        }
                    }
                    jsonReader.endObject();
                    if (b == 1 && r0Var != null) {
                        o0Var.c = new q0(r0Var, list2, list3, bool, z0Var, list4, i7);
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        if (r0Var == null) {
                            sb3.append(" execution");
                        }
                        if (b == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(no.a.n("Missing required properties:", sb3));
                    }
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null content");
                            }
                            str3 = nextString;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                    o0Var.e = new c1(str3);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    o0Var.b = nextString2;
                    break;
                case 5:
                    o0Var.a = jsonReader.nextLong();
                    o0Var.g = (byte) (o0Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return o0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004b, code lost:
    
        if (r2.equals("reason") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t0 f(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        t0 t0Var = null;
        byte b = 0;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new t0(str, str2, list, t0Var, i);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" type");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                throw new IllegalStateException(no.a.n("Missing required properties:", sb));
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -934964668:
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    List d = d(jsonReader, new a(3));
                    if (d == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = d;
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = nextString;
                    break;
                case 3:
                    t0Var = f(jsonReader);
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static z0 g(JsonReader jsonReader) {
        y0 y0Var = new y0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    y0Var.b = jsonReader.nextInt();
                    y0Var.e = (byte) (y0Var.e | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    y0Var.a = nextString;
                    break;
                case "defaultProcess":
                    y0Var.d = jsonReader.nextBoolean();
                    y0Var.e = (byte) (y0Var.e | 4);
                    break;
                case "importance":
                    y0Var.c = jsonReader.nextInt();
                    y0Var.e = (byte) (y0Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b0 h(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        char c4;
        Charset charset = n2.a;
        a0 a0Var = new a0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new m11.r(29));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                    a0Var.k = new g0(list, str);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    a0Var.a = nextString;
                    break;
                case 2:
                    a0Var.g = jsonReader.nextString();
                    break;
                case 3:
                    a0Var.l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    a0Var.h = nextString2;
                    break;
                case 5:
                    a0Var.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    a0Var.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    a0Var.d = nextString4;
                    break;
                case '\b':
                    a0Var.e = jsonReader.nextString();
                    break;
                case '\t':
                    a0Var.c = jsonReader.nextInt();
                    a0Var.m = (byte) (a0Var.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    a0Var.i = nextString5;
                    break;
                case 11:
                    i0 i0Var = new i0();
                    i0Var.f = false;
                    i0Var.m = (byte) (i0Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                i0Var.d = jsonReader.nextLong();
                                i0Var.m = (byte) (i0Var.m | 1);
                                break;
                            case 1:
                                i0Var.c = jsonReader.nextString();
                                break;
                            case 2:
                                i0Var.b = new String(Base64.decode(jsonReader.nextString(), 2), n2.a);
                                break;
                            case 3:
                                i0Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                m0 m0Var = new m0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            m0Var.f = jsonReader.nextBoolean();
                                            m0Var.j = (byte) (m0Var.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            m0Var.h = nextString6;
                                            break;
                                        case 2:
                                            m0Var.d = jsonReader.nextLong();
                                            m0Var.j = (byte) (m0Var.j | 4);
                                            break;
                                        case 3:
                                            m0Var.a = jsonReader.nextInt();
                                            m0Var.j = (byte) (m0Var.j | 1);
                                            break;
                                        case 4:
                                            m0Var.e = jsonReader.nextLong();
                                            m0Var.j = (byte) (m0Var.j | 8);
                                            break;
                                        case 5:
                                            m0Var.c = jsonReader.nextInt();
                                            m0Var.j = (byte) (m0Var.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            m0Var.b = nextString7;
                                            break;
                                        case 7:
                                            m0Var.g = jsonReader.nextInt();
                                            m0Var.j = (byte) (m0Var.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            m0Var.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.j = m0Var.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                i0Var.k = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                h1 h1Var = new h1();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = 2;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z = 3;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        default:
                                            z = -1;
                                            break;
                                    }
                                    switch (z) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            h1Var.c = nextString9;
                                            break;
                                        case true:
                                            h1Var.d = jsonReader.nextBoolean();
                                            h1Var.e = (byte) (h1Var.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            h1Var.b = nextString10;
                                            break;
                                        case true:
                                            h1Var.a = jsonReader.nextInt();
                                            h1Var.e = (byte) (h1Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.i = h1Var.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c4 = 5;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                        case 0:
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case 1:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case 4:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 != null && str3 != null) {
                                    i0Var.g = new k0(str2, str3, str4, str5, str6, str7);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str2 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb.append(" version");
                                    }
                                    throw new IllegalStateException(no.a.n("Missing required properties:", sb));
                                }
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                i0Var.h = new j1(str8);
                                break;
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                i0Var.a = nextString11;
                                break;
                            case '\n':
                                i0Var.f = jsonReader.nextBoolean();
                                i0Var.m = (byte) (i0Var.m | 2);
                                break;
                            case 11:
                                i0Var.l = jsonReader.nextInt();
                                i0Var.m = (byte) (i0Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    a0Var.j = i0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a0Var.a();
    }

    public static b0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 h = h(jsonReader);
                jsonReader.close();
                return h;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
