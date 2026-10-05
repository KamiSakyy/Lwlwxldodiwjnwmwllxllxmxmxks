package com.github.rudroid.adapters.viewholders;

import android.view.View;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class v1 implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.interfaces.w f6206b;

    public /* synthetic */ v1(com.github.rudroid.interfaces.w wVar, int i) {
        this.f6205a = i;
        this.f6206b = wVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f6205a;
        com.github.rudroid.interfaces.w wVar = this.f6206b;
        switch (i) {
            case k5.f.J /* 0 */:
                int i10 = w1.f6217w;
                Object tag = view.getTag();
                if (tag instanceof ZonedDateTime) {
                    wVar.m1((ZonedDateTime) tag);
                    break;
                }
                break;
            default:
                int i11 = v2.f6207v;
                Object tag2 = view.getTag();
                if (tag2 instanceof ZonedDateTime) {
                    wVar.m1((ZonedDateTime) tag2);
                    break;
                }
                break;
        }
        return true;
    }
}
