package com.github.rudroid.agents;

import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class d4 implements Parcelable {
    public static final a Companion = new a();

    /* renamed from: r, reason: collision with root package name */
    public com.github.rudroid.common.d f7031r;

    /* renamed from: s, reason: collision with root package name */
    public String f7032s;

    /* renamed from: t, reason: collision with root package name */
    public String f7033t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7034u;

    public static final class a {
    }

    public d4(com.github.rudroid.common.d dVar, String str, String str2, boolean z10) {
        this.f7031r = dVar;
        this.f7032s = str;
        this.f7033t = str2;
        this.f7034u = z10;
    }
}
