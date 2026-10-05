package com.apollographql.apollo.internal;

import h91.e0;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class e implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4303r = 1;

    /* renamed from: s, reason: collision with root package name */
    public final Closeable f4304s;

    public e(j9.b bVar) {
        this.f4304s = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4303r) {
            case k5.f.J:
                this.f4304s.close();
                break;
            default:
                ((j9.b) this.f4304s).close();
                break;
        }
    }

    public e(ArrayList arrayList, e0 e0Var) {
        this.f4304s = e0Var;
    }
}
