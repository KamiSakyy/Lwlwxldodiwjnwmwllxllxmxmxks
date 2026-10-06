package com.github.rudroid.block;

import android.content.Context;
import android.view.MenuItem;

/* loaded from: /home/user/work/p/classes.dex */
public class s {
    public static void a(Context context, p.l lVar, boolean z10) {
        k71.k.g(lVar, "menu");
        MenuItem findItem = lVar.findItem(2131362119);
        if (findItem != null) {
            findItem.setVisible(z10);
            rc.h.c(findItem, context, 2131100991);
        }
    }

    public static void b(Context context, p.l lVar, boolean z10) {
        k71.k.g(lVar, "menu");
        MenuItem findItem = lVar.findItem(2131361950);
        if (findItem != null) {
            findItem.setVisible(!z10);
            rc.h.c(findItem, context, 2131100991);
        }
    }

    public static void c(p.l lVar, boolean z10) {
        k71.k.g(lVar, "menu");
        MenuItem findItem = lVar.findItem(2131362136);
        if (findItem != null) {
            findItem.setVisible(z10);
        }
    }
}
