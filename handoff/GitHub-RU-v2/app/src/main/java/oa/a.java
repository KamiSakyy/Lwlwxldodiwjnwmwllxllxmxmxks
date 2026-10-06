package oa;

import android.accounts.Account;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f30099a;

    /* renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f30100b;

    public a(String str) {
        k71.k.g(str, "accountType");
        this.f30099a = str;
        this.f30100b = new ConcurrentHashMap();
    }

    public final Account a(String str) {
        Object putIfAbsent;
        k71.k.g(str, "accountName");
        ConcurrentHashMap concurrentHashMap = this.f30100b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new Account(str, this.f30099a)))) != null) {
            obj = putIfAbsent;
        }
        return (Account) obj;
    }
}
