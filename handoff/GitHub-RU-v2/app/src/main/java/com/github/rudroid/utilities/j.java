package com.github.rudroid.utilities;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.PersistableBundle;
import com.github.rudroid.activities.DeepLinkActivity;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public sc.c1 a;
    public k.i b;

    public j(sc.c1 c1Var, k.i iVar) {
        k71.k.g(c1Var, "forUserImageLoaderFactory");
        this.a = c1Var;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, String str3, String str4, String str5, c71.c cVar) {
        i iVar;
        int i;
        r9.q qVar;
        Drawable drawable;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i2 = iVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.B = i2 - Integer.MIN_VALUE;
                Object obj = iVar.z;
                b71.a aVar = b71.a.r;
                i = iVar.B;
                k.i iVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    int dimensionPixelSize = iVar2.getResources().getDimensionPixelSize(R.dimen.app_icon_size);
                    g9.h hVar = (g9.h) this.a.a(jVar);
                    r9.i iVar3 = new r9.i(iVar2);
                    iVar3.c = str3;
                    iVar3.d(dimensionPixelSize);
                    iVar3.r = 2131231308;
                    iVar3.h = sy.f0.u(x61.l.g0(new u9.d[]{new u9.a()}));
                    r9.k a = iVar3.a();
                    iVar.u = jVar;
                    iVar.v = str;
                    iVar.w = str2;
                    iVar.x = str4;
                    iVar.y = str5;
                    iVar.B = 1;
                    obj = hVar.c(a, iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = iVar.y;
                    str4 = iVar.x;
                    str2 = iVar.w;
                    str = iVar.v;
                    jVar = iVar.u;
                    sy.y.j(obj);
                }
                qVar = (r9.l) obj;
                if (!(qVar instanceof r9.f)) {
                    drawable = null;
                } else {
                    if (!(qVar instanceof r9.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    drawable = qVar.a;
                }
                Icon createWithBitmap = drawable == null ? Icon.createWithBitmap(aa1.b.R(drawable, 0, 0, 7)) : Icon.createWithResource((Context) iVar2, 2131231308);
                k71.k.d(createWithBitmap);
                String string = iVar2.getString(2131954768, str2, str);
                k71.k.f(string, "getString(...)");
                Intent intent = new Intent((Context) iVar2, (Class<?>) DeepLinkActivity.class);
                intent.setData(Uri.parse(str4));
                intent.setAction("android.intent.action.VIEW");
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("user", jVar.a);
                ShortcutInfo build = new ShortcutInfo.Builder(iVar2, str5).setShortLabel(str).setLongLabel(string).setExtras(persistableBundle).setIcon(createWithBitmap).setIntent(intent).build();
                k71.k.f(build, "build(...)");
                return build;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.z;
        b71.a aVar2 = b71.a.r;
        i = iVar.B;
        k.i iVar22 = this.b;
        if (i != 0) {
        }
        qVar = (r9.l) obj2;
        if (!(qVar instanceof r9.f)) {
        }
        if (drawable == null) {
        }
        k71.k.d(createWithBitmap);
        String string2 = iVar22.getString(2131954768, str2, str);
        k71.k.f(string2, "getString(...)");
        Intent intent2 = new Intent((Context) iVar22, (Class<?>) DeepLinkActivity.class);
        intent2.setData(Uri.parse(str4));
        intent2.setAction("android.intent.action.VIEW");
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("user", jVar.a);
        ShortcutInfo build2 = new ShortcutInfo.Builder(iVar22, str5).setShortLabel(str).setLongLabel(string2).setExtras(persistableBundle2).setIcon(createWithBitmap).setIntent(intent2).build();
        k71.k.f(build2, "build(...)");
        return build2;
    }
}
