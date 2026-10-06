package com.github.rudroid.support;

import android.net.Uri;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final a Companion = new a();
    public String a;
    public int b;

    public static final class a {
    }

    /* renamed from: com.github.rudroid.support.b$b, reason: collision with other inner class name */
    public static final class C0008b extends b {
    }

    public static final class c extends b {
        public Uri c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri) {
            super(uri.toString(), 1);
            k71.k.g(uri, "uri");
            this.c = uri;
        }
    }

    public b(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
