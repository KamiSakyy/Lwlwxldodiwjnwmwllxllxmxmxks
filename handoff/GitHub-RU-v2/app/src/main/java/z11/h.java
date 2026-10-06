package z11;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import c21.uShadow;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.util.Arrays;
import m7.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public static h c;
    public Context a;
    public volatile String b;

    public h(Context context) {
        this.a = context.getApplicationContext();
    }

    public static h a(Context context) {
        u.g(context);
        synchronized (h.class) {
            if (c == null) {
                j jVar = o.a;
                synchronized (o.class) {
                    try {
                        if (o.e == null) {
                            o.e = context.getApplicationContext();
                        }
                    } finally {
                    }
                }
                c = new h(context);
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c(PackageInfo packageInfo, boolean z) {
        o21.f fVar;
        o21.f fVar2;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                fVar = z ? n.c : n.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        o21.b bVar = o21.e.s;
                        Object[] objArr = {bArr};
                        b91.g.d0(1, objArr);
                        fVar2 = new o21.f(1, objArr);
                    } else {
                        o21.b bVar2 = o21.e.s;
                        fVar2 = o21.f.v;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                        o21.b bVar3 = o21.e.s;
                        Object[] objArr2 = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray = signingCertificateHistory[i3].toByteArray();
                            byteArray.getClass();
                            int length2 = objArr2.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int highestOneBit = Integer.highestOneBit(i4);
                                    i = highestOneBit + highestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArr2 = Arrays.copyOf(objArr2, i);
                            }
                            objArr2[i4] = byteArray;
                            i3++;
                            i4 = i5;
                        }
                        fVar2 = i4 == 0 ? o21.f.v : new o21.f(i4, objArr2);
                    }
                    o21.b bVar4 = o21.e.s;
                    fVar2 = o21.f.v;
                }
            } catch (IllegalArgumentException unused) {
                if ((z ? d(packageInfo, n.a) : d(packageInfo, n.a[0])) != null) {
                }
            }
            if (fVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            o21.e f = fVar2.f();
            int size = f.size();
            int i6 = 0;
            while (i6 < size) {
                byte[] bArr2 = (byte[]) f.get(i6);
                o21.b listIterator = fVar.listIterator(0);
                do {
                    int i7 = i6 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static k d(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        l lVar = new l(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < kVarArr.length; i++) {
            if (kVarArr[i].equals(lVar)) {
                return kVarArr[i];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        r b;
        int length;
        ApplicationInfo applicationInfo;
        boolean P;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            b = r.b("no pkgs");
        } else {
            int i2 = 0;
            b = null;
            while (true) {
                if (i2 >= length) {
                    u.g(b);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    b = r.b("null pkg");
                } else if (str.equals(this.b)) {
                    b = r.c;
                } else {
                    j jVar = o.a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        o.a();
                        P = ((c21.r) o.c).P();
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (RemoteException | DynamiteModule$LoadingException unused) {
                    } finally {
                    }
                    if (P) {
                        boolean a = g.a(this.a);
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            u.g(o.e);
                            try {
                                o.a();
                                u.g(o.e);
                                Context context = (Context) j21.b.N(j21.b.M(new j21.b(o.e)));
                                try {
                                    c21.r rVar = (c21.r) o.c;
                                    Parcel g = rVar.g();
                                    int i3 = o21.g.a;
                                    g.writeInt(1);
                                    int Z = y.Z(g, 20293);
                                    y.V(g, 1, str);
                                    y.Y(g, 2, 4);
                                    g.writeInt(a ? 1 : 0);
                                    y.Y(g, 3, 4);
                                    g.writeInt(0);
                                    y.T(g, 4, new j21.b(context));
                                    y.Y(g, 5, 4);
                                    g.writeInt(0);
                                    y.Y(g, 6, 4);
                                    g.writeInt(1);
                                    y.Y(g, 8, 4);
                                    g.writeInt(0);
                                    y.a0(g, Z);
                                    Parcel e = rVar.e(g, 6);
                                    p pVar = (p) o21.g.a(e, p.CREATOR);
                                    e.recycle();
                                    if (pVar.r) {
                                        sy.n.M(pVar.u);
                                        b = new r(true, null, null);
                                    } else {
                                        String str2 = pVar.s;
                                        PackageManager.NameNotFoundException nameNotFoundException = sy.oShadow.o(pVar.t) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        sy.n.M(pVar.u);
                                        sy.oShadow.o(pVar.t);
                                        b = new r(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e2) {
                                    b = r.c("module call", e2);
                                }
                            } catch (DynamiteModule$LoadingException e3) {
                                b = r.c("module init: ".concat(String.valueOf(e3.getMessage())), e3);
                            }
                            if (b.a) {
                                this.b = str;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                            boolean a2 = g.a(this.a);
                            if (packageInfo == null) {
                                b = r.b("null pkg");
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    b = r.b("single cert required");
                                } else {
                                    l lVar = new l(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        r b2 = o.b(str3, lVar, a2, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                        if (b2.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                r b3 = o.b(str3, lVar, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                if (b3.a) {
                                                    b = r.b("debuggable release cert app rejected");
                                                }
                                            } finally {
                                            }
                                        }
                                        b = b2;
                                    } finally {
                                    }
                                }
                            }
                            if (b.a) {
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            b = r.c("no pkg ".concat(str), e4);
                        }
                    }
                }
                if (b.a) {
                    break;
                }
                i2++;
            }
        }
        if (!b.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (b.b != null) {
                b.a();
            } else {
                b.a();
            }
        }
        return b.a;
    }
    public Object d(Object p1, Object p2) { return null; }
}
