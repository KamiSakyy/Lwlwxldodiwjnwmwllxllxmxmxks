package com.github.rudroid.pushnotifications.decryption;

import java.security.KeyStore;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class h implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18563r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ KeyStore f18564s;

    public /* synthetic */ h(KeyStore keyStore, int i) {
        this.f18563r = i;
        this.f18564s = keyStore;
    }

    public final Object k(Object obj) {
        String str = (String) obj;
        switch (this.f18563r) {
        }
        return new w61.k(str, this.f18564s.getCreationDate(str));
    }
}
