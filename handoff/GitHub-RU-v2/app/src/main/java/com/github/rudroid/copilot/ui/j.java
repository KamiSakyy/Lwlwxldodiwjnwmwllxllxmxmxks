package com.github.rudroid.copilot.ui;

import android.content.Context;
import com.github.rudroid.activities.WebViewActivity;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class j implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10109r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f10110s;

    public /* synthetic */ j(Context context, int i) {
        this.f10109r = i;
        this.f10110s = context;
    }

    public final Object k(Object obj) {
        String str = (String) obj;
        switch (this.f10109r) {
            case k5.f.J:
                k71.k.g(str, "url");
                WebViewActivity.a aVar = WebViewActivity.Companion;
                Context context = this.f10110s;
                context.startActivity(WebViewActivity.a.b(aVar, context, str));
                break;
            case 1:
                k71.k.g(str, "url");
                WebViewActivity.a aVar2 = WebViewActivity.Companion;
                Context context2 = this.f10110s;
                context2.startActivity(WebViewActivity.a.b(aVar2, context2, str));
                break;
            case 2:
                k71.k.g(str, "url");
                WebViewActivity.a aVar3 = WebViewActivity.Companion;
                Context context3 = this.f10110s;
                context3.startActivity(WebViewActivity.a.b(aVar3, context3, str));
                break;
            default:
                k71.k.g(str, "url");
                WebViewActivity.a aVar4 = WebViewActivity.Companion;
                Context context4 = this.f10110s;
                context4.startActivity(WebViewActivity.a.b(aVar4, context4, str));
                break;
        }
        return w61.a0.a;
    }
}
