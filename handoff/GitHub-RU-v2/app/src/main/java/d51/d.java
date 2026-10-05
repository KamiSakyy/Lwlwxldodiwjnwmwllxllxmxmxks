package d51;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.q1;
import androidx.compose.runtime.l1;
import androidx.compose.runtime.p1;
import c21.j;
import com.google.android.gms.measurement.internal.x3;
import h0.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l11.g0;
import l11.h0;
import l11.j0;
import l11.l;
import l11.n;
import l11.o;
import l11.q;
import l11.r;
import l11.s;
import l11.t;
import l11.v;
import l11.z;
import m11.h;
import m11.m;
import m11.p;
import n11.g;
import org.json.JSONObject;
import t11.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public x a() {
        return (x) ((p1) this.h).getValue();
    }

    public b b(int i) {
        try {
            if (y3.a.a(2, i)) {
                return null;
            }
            JSONObject r = ((x3) this.e).r();
            if (r == null) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                return null;
            }
            x3 x3Var = (x3) this.c;
            x3Var.getClass();
            b e = (r.getInt("settings_version") != 3 ? new u31.f(6) : new w50.c(6)).e((j) x3Var.s, r);
            r.toString();
            Log.isLoggable("FirebaseCrashlytics", 3);
            ((j) this.d).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (!y3.a.a(3, i) && e.c < currentTimeMillis) {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return null;
            }
            try {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return e;
            } catch (Exception unused) {
                return e;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public b c() {
        return (b) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0422 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(m11.j jVar, int i) {
        byte[] bArr;
        u11.b bVar;
        long j;
        g gVar;
        n11.a aVar;
        String str;
        n11.a aVar2;
        int i2;
        k11.b m;
        String str2;
        Integer num;
        g gVar2;
        d dVar;
        int i3;
        final d dVar2 = this;
        final m11.j jVar2 = jVar;
        byte[] bArr2 = jVar2.b;
        u11.b bVar2 = (u11.b) dVar2.f;
        g a = ((n11.e) dVar2.b).a(jVar2.a);
        long j2 = 0;
        while (true) {
            final int i4 = 0;
            i iVar = (i) bVar2;
            if (!((Boolean) iVar.E(new u11.a(dVar2) { // from class: s11.e
                public final /* synthetic */ d51.d s;

                {
                    this.s = dVar2;
                }

                @Override // u11.a
                public final Object j() {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            m11.j jVar3 = jVar2;
                            i iVar2 = (i) ((t11.d) this.s.c);
                            SQLiteDatabase f = iVar2.f();
                            f.beginTransaction();
                            try {
                                Long m2 = i.m(f, jVar3);
                                if (m2 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = iVar2.f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m2.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                f.setTransactionSuccessful();
                                return bool;
                            } finally {
                                f.endTransaction();
                            }
                        default:
                            i iVar3 = (i) ((t11.d) this.s.c);
                            iVar3.getClass();
                            return (Iterable) iVar3.r(new q1(12, iVar3, jVar2));
                    }
                }
            })).booleanValue()) {
                iVar.E(new s11.f(j2, dVar2, jVar2));
                return;
            }
            final int i5 = 1;
            Iterable iterable = (Iterable) iVar.E(new u11.a(dVar2) { // from class: s11.e
                public final /* synthetic */ d51.d s;

                {
                    this.s = dVar2;
                }

                @Override // u11.a
                public final Object j() {
                    Boolean bool;
                    switch (i5) {
                        case 0:
                            m11.j jVar3 = jVar2;
                            i iVar2 = (i) ((t11.d) this.s.c);
                            SQLiteDatabase f = iVar2.f();
                            f.beginTransaction();
                            try {
                                Long m2 = i.m(f, jVar3);
                                if (m2 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = iVar2.f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m2.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                f.setTransactionSuccessful();
                                return bool;
                            } finally {
                                f.endTransaction();
                            }
                        default:
                            i iVar3 = (i) ((t11.d) this.s.c);
                            iVar3.getClass();
                            return (Iterable) iVar3.r(new q1(12, iVar3, jVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a == null) {
                a.a.i(jVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new n11.a(3, -1L);
                bArr = bArr2;
                bVar = bVar2;
                j = j2;
                gVar = a;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t11.b) it.next()).c);
                }
                if (bArr2 != null) {
                    t11.c cVar = (t11.c) dVar2.i;
                    Objects.requireNonNull(cVar);
                    p11.a aVar3 = (p11.a) iVar.E(new c5.b(19, cVar));
                    h hVar = new h();
                    hVar.i = new HashMap();
                    hVar.g = Long.valueOf(((v11.a) dVar2.g).b());
                    hVar.h = Long.valueOf(((v11.a) dVar2.h).b());
                    hVar.b = "GDT_CLIENT_METRICS";
                    j11.c cVar2 = new j11.c("proto");
                    aVar3.getClass();
                    l51.h hVar2 = p.a;
                    hVar2.getClass();
                    bArr = bArr2;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar2.n(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar.f = new m(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((k11.c) a).a(hVar.c()));
                } else {
                    bArr = bArr2;
                }
                k11.c cVar3 = (k11.c) a;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    m11.i iVar2 = (m11.i) obj;
                    String str3 = iVar2.a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(iVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar2);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    m11.i iVar3 = (m11.i) ((List) entry.getValue()).get(0);
                    j0 j0Var = j0.r;
                    long b = cVar3.f.b();
                    long b2 = cVar3.e.b();
                    n nVar = new n(new l(Integer.valueOf(iVar3.b("sdk-version")), iVar3.a("model"), iVar3.a("hardware"), iVar3.a("device"), iVar3.a("product"), iVar3.a("os-uild"), iVar3.a("manufacturer"), iVar3.a("fingerprint"), iVar3.a("locale"), iVar3.a("country"), iVar3.a("mcc_mnc"), iVar3.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (m11.i iVar4 : (List) entry.getValue()) {
                        u11.b bVar3 = bVar2;
                        m mVar = iVar4.c;
                        long j3 = j2;
                        byte[] bArr3 = iVar4.j;
                        j11.c cVar4 = mVar.a;
                        byte[] bArr4 = mVar.b;
                        if (cVar4.equals(new j11.c("proto"))) {
                            dVar = new d();
                            dVar.e = bArr4;
                            gVar2 = a;
                        } else {
                            gVar2 = a;
                            if (cVar4.equals(new j11.c("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                d dVar3 = new d();
                                dVar3.f = str4;
                                dVar = dVar3;
                            } else {
                                if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                                    cVar4.toString();
                                }
                                bVar2 = bVar3;
                                j2 = j3;
                                a = gVar2;
                            }
                        }
                        dVar.a = Long.valueOf(iVar4.d);
                        dVar.d = Long.valueOf(iVar4.e);
                        String str5 = (String) iVar4.f.get("tz-offset");
                        dVar.g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        dVar.h = new v((h0) h0.r.get(iVar4.b("net-type")), (g0) g0.r.get(iVar4.b("mobile-subtype")));
                        Integer num2 = iVar4.b;
                        if (num2 != null) {
                            dVar.b = num2;
                        }
                        Integer num3 = iVar4.g;
                        if (num3 != null) {
                            r rVar = new r(new q(num3));
                            z zVar = z.r;
                            dVar.c = new o(rVar);
                        }
                        byte[] bArr5 = iVar4.i;
                        if (bArr5 != null || bArr3 != null) {
                            if (bArr5 == null) {
                                bArr5 = null;
                            }
                            dVar.i = new l11.p(bArr5, bArr3 != null ? bArr3 : null);
                        }
                        String str6 = ((Long) dVar.a) == null ? " eventTimeMs" : "";
                        if (((Long) dVar.d) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) dVar.g) == null) {
                            str6 = x.i.f(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new s(((Long) dVar.a).longValue(), (Integer) dVar.b, (o) dVar.c, ((Long) dVar.d).longValue(), (byte[]) dVar.e, (String) dVar.f, ((Long) dVar.g).longValue(), (v) dVar.h, (l11.p) dVar.i));
                        bVar2 = bVar3;
                        j2 = j3;
                        a = gVar2;
                    }
                    arrayList3.add(new t(b, b2, nVar, num, str2, arrayList4));
                    bVar2 = bVar2;
                }
                bVar = bVar2;
                j = j2;
                gVar = a;
                l11.m mVar2 = new l11.m(arrayList3);
                URL url = cVar3.d;
                if (bArr != null) {
                    try {
                        k11.a a2 = k11.a.a(bArr);
                        str = a2.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a2.a;
                        if (str7 != null) {
                            url = k11.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new n11.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    a5.s sVar = new a5.s(url, mVar2, str, 25);
                    c5.b bVar4 = new c5.b(16, cVar3);
                    int i7 = 5;
                    do {
                        m = bVar4.m(sVar);
                        URL url2 = m.b;
                        if (url2 != null) {
                            a.a.i(url2, "CctTransportBackend", "Following redirect to: %s");
                            sVar = new a5.s(url2, (l11.m) sVar.u, (String) sVar.s, 25);
                        } else {
                            sVar = null;
                        }
                        if (sVar == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = m.a;
                    if (i8 == 200) {
                        aVar2 = new n11.a(1, m.c);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            aVar = new n11.a(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                aVar = new n11.a(4, -1L);
                            } catch (IOException unused4) {
                                Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
                                i2 = 2;
                                aVar2 = new n11.a(2, -1L);
                                i3 = aVar2.a;
                                if (i3 != i2) {
                                }
                            }
                        } else {
                            aVar = new n11.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException unused5) {
                }
            }
            i2 = 2;
            i3 = aVar2.a;
            if (i3 != i2) {
                iVar.E(new q41.b(this, iterable, jVar, j));
                ((l51.h) this.d).H(jVar, i + 1, true);
                return;
            }
            dVar2 = this;
            jVar2 = jVar;
            j2 = j;
            iVar.E(new q1(10, dVar2, iterable));
            if (i3 == 1) {
                j2 = Math.max(j2, aVar2.b);
                if (bArr != null) {
                    iVar.E(new c5.b(21, dVar2));
                }
            } else if (i3 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str8 = ((t11.b) it2.next()).c.a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                iVar.E(new q1(11, dVar2, hashMap2));
            }
            bArr2 = bArr;
            bVar2 = bVar;
            a = gVar;
        }
    }

    public float e(float f) {
        float f2;
        float f3;
        l1 l1Var = (l1) this.e;
        float y = (Float.isNaN(l1Var.y()) ? 0.0f : l1Var.y()) + f;
        float[] fArr = a().b;
        if (fArr.length == 0) {
            f2 = Float.NaN;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    f4 = Math.min(f4, fArr[i]);
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            f2 = f4;
        }
        float[] fArr2 = a().b;
        if (fArr2.length == 0) {
            f3 = Float.NaN;
        } else {
            float f5 = fArr2[0];
            int i2 = 1;
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    f5 = Math.max(f5, fArr2[i2]);
                    if (i2 == length2) {
                        break;
                    }
                    i2++;
                }
            }
            f3 = f5;
        }
        return aa1.b.u(y, f2, f3);
    }

    public float f() {
        l1 l1Var = (l1) this.e;
        if (Float.isNaN(l1Var.y())) {
            k0.b.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return l1Var.y();
    }

    public void g(Object obj) {
        ((p1) this.b).setValue(obj);
    }
}
