package com.github.rudroid.activities;

import android.content.Intent;
import android.os.Bundle;
import com.github.rudroid.activities.CreateIssueRepoSearchActivity;

/* loaded from: /home/user/work/p/classes.dex */
public final class ShareImageActivity extends o1 {
    public ShareImageActivity() {
        this.f5864h0 = false;
        C(new n1(this));
    }

    @Override // com.github.rudroid.activities.m0, com.github.rudroid.activities.c1, k.i, d.j, n4.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s0(getIntent());
    }

    @Override // d.j, android.app.Activity
    public final void onNewIntent(Intent intent) {
        k71.k.g(intent, "intent");
        super.onNewIntent(intent);
        s0(intent);
    }

    public final void s0(Intent intent) {
        if (intent != null) {
            if (b0().g() == null) {
                m0.h0(this, null, null, 7);
            } else {
                CreateIssueRepoSearchActivity.Companion.getClass();
                Intent a10 = CreateIssueRepoSearchActivity.a.a(this, null);
                a10.setAction("android.intent.action.SEND");
                a10.putExtras(intent);
                startActivity(a10);
            }
        }
        finish();
    }

    public <T0> T0 getIntent(Object... a) {
        return null;
    }

    public <T0> T0 b0(Object... a) {
        return null;
    }

    public <T0> T0 startActivity(Object... a) {
        return null;
    }

    public <T0> T0 finish(Object... a) {
        return null;
    }
}
