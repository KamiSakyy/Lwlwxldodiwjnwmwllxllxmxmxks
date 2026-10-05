package k11;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.x3;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import k51.d;
import l11.a0;
import l11.b0;
import l11.c0;
import l11.d0;
import l11.e;
import l11.e0;
import l11.f;
import l11.f0;
import l11.g0;
import l11.h;
import l11.h0;
import l11.i;
import l11.i0;
import l11.j;
import l11.k;
import l11.l;
import l11.m;
import l11.n;
import l11.o;
import l11.p;
import l11.q;
import l11.r;
import l11.s;
import l11.t;
import l11.v;
import l11.w;
import l11.y;
import n11.g;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements g {
    public final x3 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final v11.a e;
    public final v11.a f;
    public final int g;

    public c(Context context, v11.a aVar, v11.a aVar2) {
        d dVar = new d();
        l11.c cVar = l11.c.a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        l11.d dVar2 = l11.d.a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        l11.b bVar = l11.b.a;
        dVar.a(l11.a.class, bVar);
        dVar.a(l.class, bVar);
        i iVar = i.a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        e eVar = e.a;
        dVar.a(a0.class, eVar);
        dVar.a(o.class, eVar);
        h hVar = h.a;
        dVar.a(d0.class, hVar);
        dVar.a(r.class, hVar);
        l11.g gVar = l11.g.a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        f fVar = f.a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.d = true;
        this.a = new x3(29, dVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.c);
        this.e = aVar2;
        this.f = aVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(f1.e.g("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (((l11.g0) l11.g0.r.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m11.i a(m11.i iVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        m11.h c = iVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.i;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c.b("model", Build.MODEL);
        c.b("hardware", Build.HARDWARE);
        c.b("device", Build.DEVICE);
        c.b("product", Build.PRODUCT);
        c.b("os-uild", Build.ID);
        c.b("manufacturer", Build.MANUFACTURER);
        c.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c.i;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = h0.r;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.i;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = g0.r;
                subtype = 100;
            }
            hashMap = (HashMap) c.i;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c.b("country", Locale.getDefault().getCountry());
            c.b("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c.b("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
            }
            c.b("application_build", Integer.toString(i2));
            return c.c();
        }
        SparseArray sparseArray3 = g0.r;
        subtype = 0;
        hashMap = (HashMap) c.i;
        if (hashMap != null) {
        }
    }
}
