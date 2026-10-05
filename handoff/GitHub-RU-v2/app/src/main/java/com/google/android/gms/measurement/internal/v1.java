package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v1 extends com.google.android.gms.internal.measurement.y implements f0 {
    public final o4 f;
    public Boolean g;
    public String h;

    public v1(o4 o4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        c21.u.g(o4Var);
        this.f = o4Var;
        this.h = null;
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void A(v4 v4Var) {
        g(v4Var);
        M(new q1(this, v4Var, 0));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void D(v4 v4Var) {
        g(v4Var);
        M(new q1(this, v4Var, 1));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final List F(String str, String str2, boolean z, v4 v4Var) {
        g(v4Var);
        String str3 = v4Var.r;
        c21.u.g(str3);
        o4 o4Var = this.f;
        try {
            List<r4> list = (List) o4Var.b().G(new s1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r4 r4Var : list) {
                if (!z && t4.Y(r4Var.c)) {
                }
                arrayList.add(new q4(r4Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            o4Var.a().x.c("Failed to query user properties. appId", s0.H(str3), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            o4Var.a().x.c("Failed to query user properties. appId", s0.H(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final String G(v4 v4Var) {
        g(v4Var);
        o4 o4Var = this.f;
        try {
            return (String) o4Var.b().G(new p1(o4Var, v4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            o4Var.a().x.c("Failed to get app instance id. appId", s0.H(v4Var.r), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final List H(String str, String str2, v4 v4Var) {
        g(v4Var);
        String str3 = v4Var.r;
        c21.u.g(str3);
        o4 o4Var = this.f;
        try {
            return (List) o4Var.b().G(new s1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            o4Var.a().x.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void J(v4 v4Var) {
        c21.u.d(v4Var.r);
        c21.u.g(v4Var.J);
        f(new q1(this, v4Var, 4));
    }

    public final void L(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        o4 o4Var = this.f;
        if (isEmpty) {
            o4Var.a().x.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.g == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.h)) {
                        Context context = o4Var.C.r;
                        if (g21.b.b(Binder.getCallingUid(), context, "com.google.android.gms")) {
                            try {
                                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                z11.h a = z11.h.a(context);
                                a.getClass();
                                if (packageInfo != null) {
                                    if (!z11.h.c(packageInfo, false)) {
                                        if (z11.h.c(packageInfo, true) && z11.g.a(a.a)) {
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                                Log.isLoggable("UidVerifier", 3);
                            }
                        }
                        if (!z11.h.a(o4Var.C.r).b(Binder.getCallingUid())) {
                            z2 = false;
                        }
                    }
                    this.g = Boolean.valueOf(z2);
                }
                if (this.g.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                o4Var.a().x.b(s0.H(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.h == null) {
            Context context2 = o4Var.C.r;
            int callingUid = Binder.getCallingUid();
            int i = z11.g.e;
            if (g21.b.b(callingUid, context2, str)) {
                this.h = str;
            }
        }
        if (str.equals(this.h)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void M(Runnable runnable) {
        o4 o4Var = this.f;
        if (o4Var.b().F()) {
            runnable.run();
        } else {
            o4Var.b().I(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.y
    public final boolean e(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        o4 o4Var = this.f;
        ArrayList arrayList = null;
        h0 h0Var = null;
        j0 j0Var = null;
        switch (i) {
            case 1:
                w wVar = (w) com.google.android.gms.internal.measurement.z.a(parcel, w.CREATOR);
                v4 v4Var = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                r(wVar, v4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                q4 q4Var = (q4) com.google.android.gms.internal.measurement.z.a(parcel, q4.CREATOR);
                v4 v4Var2 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                x(q4Var, v4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                v4 v4Var3 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                A(v4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                w wVar2 = (w) com.google.android.gms.internal.measurement.z.a(parcel, w.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                c21.u.g(wVar2);
                c21.u.d(readString);
                L(readString, true);
                M(new c51.c(this, wVar2, readString, 3));
                parcel2.writeNoException();
                return true;
            case 6:
                v4 v4Var4 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                s(v4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                v4 v4Var5 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.z.d(parcel);
                g(v4Var5);
                String str = v4Var5.r;
                c21.u.g(str);
                try {
                    List<r4> list2 = (List) o4Var.b().G(new p1(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (r4 r4Var : list2) {
                        if (objArr == false && t4.Y(r4Var.c)) {
                        }
                        arrayList2.add(new q4(r4Var));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    o4Var.a().x.c("Failed to get user properties. appId", s0.H(str), e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    o4Var.a().x.c("Failed to get user properties. appId", s0.H(str), e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                w wVar3 = (w) com.google.android.gms.internal.measurement.z.a(parcel, w.CREATOR);
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                byte[] w = w(wVar3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(w);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                l(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                v4 v4Var6 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                String G = G(v4Var6);
                parcel2.writeNoException();
                parcel2.writeString(G);
                return true;
            case 12:
                f fVar = (f) com.google.android.gms.internal.measurement.z.a(parcel, f.CREATOR);
                v4 v4Var7 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                j(fVar, v4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                f fVar2 = (f) com.google.android.gms.internal.measurement.z.a(parcel, f.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                c21.u.g(fVar2);
                c21.u.g(fVar2.t);
                c21.u.d(fVar2.r);
                L(fVar2.r, true);
                M(new com.google.common.util.concurrent.b(this, new f(fVar2), false, 7));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.z.a;
                z = parcel.readInt() != 0;
                v4 v4Var8 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                List F = F(readString6, readString7, z, v4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(F);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.z.a;
                z = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.z.d(parcel);
                List i2 = i(readString8, readString9, readString10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(i2);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                v4 v4Var9 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                List H = H(readString11, readString12, v4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(H);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                List o = o(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(o);
                return true;
            case 18:
                v4 v4Var10 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                n(v4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                v4 v4Var11 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                z(bundle, v4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                v4 v4Var12 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                J(v4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                v4 v4Var13 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                j y = y(v4Var13);
                parcel2.writeNoException();
                if (y == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                y.writeToParcel(parcel2, 1);
                return true;
            case 24:
                v4 v4Var14 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                g(v4Var14);
                String str2 = v4Var14.r;
                c21.u.g(str2);
                if (o4Var.e0().J(null, c0.Y0)) {
                    try {
                        list = (List) o4Var.b().H(new t1(this, v4Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        o4Var.a().x.c("Failed to get trigger URIs. appId", s0.H(str2), e3);
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) o4Var.b().G(new t1(this, v4Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        o4Var.a().x.c("Failed to get trigger URIs. appId", s0.H(str2), e4);
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                v4 v4Var15 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                p(v4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                v4 v4Var16 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                t(v4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                v4 v4Var17 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                D(v4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                v4 v4Var18 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                g4 g4Var = (g4) com.google.android.gms.internal.measurement.z.a(parcel, g4.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    j0Var = queryLocalInterface instanceof j0 ? (j0) queryLocalInterface : new i0(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                com.google.android.gms.internal.measurement.z.d(parcel);
                h(v4Var18, g4Var, j0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                v4 v4Var19 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                e eVar = (e) com.google.android.gms.internal.measurement.z.a(parcel, e.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                v(v4Var19, eVar);
                parcel2.writeNoException();
                return true;
            case 31:
                v4 v4Var20 = (v4) com.google.android.gms.internal.measurement.z.a(parcel, v4.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    h0Var = queryLocalInterface2 instanceof h0 ? (h0) queryLocalInterface2 : new g0(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                com.google.android.gms.internal.measurement.z.d(parcel);
                q(v4Var20, bundle3, h0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void f(Runnable runnable) {
        o4 o4Var = this.f;
        if (o4Var.b().F()) {
            runnable.run();
        } else {
            o4Var.b().K(runnable);
        }
    }

    public final void g(v4 v4Var) {
        c21.u.g(v4Var);
        String str = v4Var.r;
        c21.u.d(str);
        L(str, false);
        this.f.k0().D(v4Var.s);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void h(v4 v4Var, g4 g4Var, j0 j0Var) {
        g(v4Var);
        String str = v4Var.r;
        c21.u.g(str);
        this.f.b().I(new a5.q1(this, str, g4Var, j0Var, 1));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final List i(String str, String str2, String str3, boolean z) {
        L(str, true);
        o4 o4Var = this.f;
        try {
            List<r4> list = (List) o4Var.b().G(new s1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r4 r4Var : list) {
                if (!z && t4.Y(r4Var.c)) {
                }
                arrayList.add(new q4(r4Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            o4Var.a().x.c("Failed to get user properties as. appId", s0.H(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            o4Var.a().x.c("Failed to get user properties as. appId", s0.H(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void j(f fVar, v4 v4Var) {
        c21.u.g(fVar);
        c21.u.g(fVar.t);
        g(v4Var);
        f fVar2 = new f(fVar);
        fVar2.r = v4Var.r;
        M(new c51.c(this, fVar2, v4Var, 1));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void l(long j, String str, String str2, String str3) {
        M(new r1(this, str2, str3, str, j, 0));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void n(v4 v4Var) {
        String str = v4Var.r;
        c21.u.d(str);
        L(str, false);
        M(new q1(this, v4Var, 3));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final List o(String str, String str2, String str3) {
        L(str, true);
        o4 o4Var = this.f;
        try {
            return (List) o4Var.b().G(new s1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            o4Var.a().x.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void p(v4 v4Var) {
        c21.u.d(v4Var.r);
        c21.u.g(v4Var.J);
        f(new q1(this, v4Var, 6));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void q(v4 v4Var, Bundle bundle, h0 h0Var) {
        g(v4Var);
        String str = v4Var.r;
        c21.u.g(str);
        this.f.b().I(new u1(this, v4Var, bundle, h0Var, str));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void r(w wVar, v4 v4Var) {
        c21.u.g(wVar);
        g(v4Var);
        M(new c51.c(this, wVar, v4Var, 2));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void s(v4 v4Var) {
        g(v4Var);
        M(new q1(this, v4Var, 2));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void t(v4 v4Var) {
        c21.u.d(v4Var.r);
        c21.u.g(v4Var.J);
        f(new q1(this, v4Var, 5));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void v(v4 v4Var, e eVar) {
        g(v4Var);
        M(new c51.c(5, this, v4Var, eVar, false));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final byte[] w(w wVar, String str) {
        c21.u.d(str);
        c21.u.g(wVar);
        L(str, true);
        o4 o4Var = this.f;
        q0 q0Var = o4Var.a().E;
        o1 o1Var = o4Var.C;
        n0 n0Var = o1Var.A;
        String str2 = wVar.r;
        q0Var.b(n0Var.a(str2), "Log and bundle. event");
        o4Var.f().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) o4Var.b().H(new h1(this, wVar, str)).get();
            if (bArr == null) {
                o4Var.a().x.b(s0.H(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            o4Var.f().getClass();
            o4Var.a().E.d("Log and bundle processed. event, size, time_ms", o1Var.A.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            o4Var.a().x.d("Failed to log and bundle. appId, event, error", s0.H(str), o1Var.A.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            o4Var.a().x.d("Failed to log and bundle. appId, event, error", s0.H(str), o1Var.A.a(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void x(q4 q4Var, v4 v4Var) {
        c21.u.g(q4Var);
        g(v4Var);
        M(new c51.c(this, q4Var, v4Var, 4));
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final j y(v4 v4Var) {
        g(v4Var);
        String str = v4Var.r;
        c21.u.d(str);
        o4 o4Var = this.f;
        try {
            return (j) o4Var.b().H(new p1(this, v4Var, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            o4Var.a().x.c("Failed to get consent. appId", s0.H(str), e);
            return new j(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void z(Bundle bundle, v4 v4Var) {
        g(v4Var);
        String str = v4Var.r;
        c21.u.g(str);
        M(new a5.q1(this, bundle, str, v4Var, 3));
    }
}
