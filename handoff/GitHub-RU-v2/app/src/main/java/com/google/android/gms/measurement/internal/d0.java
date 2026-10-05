package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 extends com.google.android.gms.internal.measurement.x implements f0 {
    public d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void A(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 4);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void D(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 27);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final List F(String str, String str2, boolean z, v4 v4Var) {
        Parcel g = g();
        g.writeString(str);
        g.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.a;
        g.writeInt(z ? 1 : 0);
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        Parcel f = f(g, 14);
        ArrayList createTypedArrayList = f.createTypedArrayList(q4.CREATOR);
        f.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final String G(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        Parcel f = f(g, 11);
        String readString = f.readString();
        f.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final List H(String str, String str2, v4 v4Var) {
        Parcel g = g();
        g.writeString(str);
        g.writeString(str2);
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        Parcel f = f(g, 16);
        ArrayList createTypedArrayList = f.createTypedArrayList(f.CREATOR);
        f.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void J(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 20);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void h(v4 v4Var, g4 g4Var, j0 j0Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        com.google.android.gms.internal.measurement.z.b(g, g4Var);
        com.google.android.gms.internal.measurement.z.c(g, j0Var);
        L(g, 29);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final List i(String str, String str2, String str3, boolean z) {
        Parcel g = g();
        g.writeString(null);
        g.writeString(str2);
        g.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.a;
        g.writeInt(z ? 1 : 0);
        Parcel f = f(g, 15);
        ArrayList createTypedArrayList = f.createTypedArrayList(q4.CREATOR);
        f.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void j(f fVar, v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, fVar);
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 12);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void l(long j, String str, String str2, String str3) {
        Parcel g = g();
        g.writeLong(j);
        g.writeString(str);
        g.writeString(str2);
        g.writeString(str3);
        L(g, 10);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void n(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 18);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final List o(String str, String str2, String str3) {
        Parcel g = g();
        g.writeString(null);
        g.writeString(str2);
        g.writeString(str3);
        Parcel f = f(g, 17);
        ArrayList createTypedArrayList = f.createTypedArrayList(f.CREATOR);
        f.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void p(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 25);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void q(v4 v4Var, Bundle bundle, h0 h0Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        com.google.android.gms.internal.measurement.z.b(g, bundle);
        com.google.android.gms.internal.measurement.z.c(g, h0Var);
        L(g, 31);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void r(w wVar, v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, wVar);
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 1);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void s(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 6);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void t(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 26);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void v(v4 v4Var, e eVar) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        com.google.android.gms.internal.measurement.z.b(g, eVar);
        L(g, 30);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final byte[] w(w wVar, String str) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, wVar);
        g.writeString(str);
        Parcel f = f(g, 9);
        byte[] createByteArray = f.createByteArray();
        f.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void x(q4 q4Var, v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, q4Var);
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 2);
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final j y(v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        Parcel f = f(g, 21);
        j jVar = (j) com.google.android.gms.internal.measurement.z.a(f, j.CREATOR);
        f.recycle();
        return jVar;
    }

    @Override // com.google.android.gms.measurement.internal.f0
    public final void z(Bundle bundle, v4 v4Var) {
        Parcel g = g();
        com.google.android.gms.internal.measurement.z.b(g, bundle);
        com.google.android.gms.internal.measurement.z.b(g, v4Var);
        L(g, 19);
    }
}
