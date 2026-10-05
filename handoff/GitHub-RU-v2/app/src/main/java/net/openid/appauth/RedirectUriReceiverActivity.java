package net.openid.appauth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes5.dex */
public class RedirectUriReceiverActivity extends k.i {
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        Intent intent = new Intent((Context) this, (Class<?>) AuthorizationManagementActivity.class);
        intent.setData(data);
        intent.addFlags(603979776);
        startActivity(intent);
        finish();
    }
}
