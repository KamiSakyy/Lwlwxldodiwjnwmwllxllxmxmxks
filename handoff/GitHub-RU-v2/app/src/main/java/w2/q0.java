package w2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: /home/user/work/p/classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f33127a;

    public q0(Context context) {
        this.f33127a = context;
    }

    public final void a(String str) {
        try {
            this.f33127a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e5) {
            throw new IllegalArgumentException(no.a.i('.', "Can't open ", str), e5);
        }
    }
}
