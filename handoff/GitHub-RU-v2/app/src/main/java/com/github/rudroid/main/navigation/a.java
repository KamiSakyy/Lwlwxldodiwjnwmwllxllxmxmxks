package com.github.rudroid.main.navigation;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import k71.k;
import kotlinx.serialization.KSerializer;
import t.a0;
import x6.l0;

/* loaded from: /home/user/work/p/classes.dex */
public class a<T extends Parcelable> extends l0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f16931r;

    /* renamed from: s, reason: collision with root package name */
    public final KSerializer f16932s;

    /* renamed from: t, reason: collision with root package name */
    public final String f16933t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Class cls, KSerializer kSerializer) {
        super(true);
        k.g(kSerializer, "serializer");
        this.f16931r = cls;
        this.f16932s = kSerializer;
        this.f16933t = cls.getName();
    }

    @Override // x6.l0
    public final Object a(String str, Bundle bundle) {
        k.g(bundle, "bundle");
        k.g(str, "key");
        return Build.VERSION.SDK_INT >= 33 ? (Parcelable) a0.E(bundle, str, this.f16931r) : bundle.getParcelable(str);
    }

    @Override // x6.l0
    public final String b() {
        return this.f16933t;
    }

    @Override // x6.l0
    public final Object d(String str) {
        k.g(str, "value");
        l81.b bVar = l81.c.d;
        KSerializer kSerializer = this.f16932s;
        String decode = Uri.decode(str);
        k.f(decode, "decode(...)");
        return (Parcelable) bVar.a(decode, kSerializer);
    }

    @Override // x6.l0
    public final void e(Bundle bundle, String str, Object obj) {
        k.g(str, "key");
        bundle.putParcelable(str, (Parcelable) obj);
    }

    @Override // x6.l0
    public final String f(Object obj) {
        Parcelable parcelable = (Parcelable) obj;
        String encode = parcelable != null ? Uri.encode(l81.c.d.b(this.f16932s, parcelable)) : null;
        return encode == null ? "" : encode;
    }
}
