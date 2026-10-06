package oa;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import x61.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements OnAccountsUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public fg.d f30101a;

    public b(fg.d dVar) {
        this.f30101a = dVar;
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] accountArr) {
        this.f30101a.k(accountArr != null ? x61.l.g0(accountArr) : r.r);
    }
}
