package oa;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /home/user/work/p/classes.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30131a;

    public n(Context context) {
        this.f30131a = context;
    }

    @Override // oa.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final SharedPreferences a(j jVar) {
        k71.k.g(jVar, "user");
        return c(jVar.f30107a);
    }

    public final SharedPreferences c(String str) {
        k71.k.g(str, "accountName");
        SharedPreferences sharedPreferences = this.f30131a.getSharedPreferences(str.concat("_preferences"), 0);
        k71.k.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j<T1,T2,T3,T4> {
        public j() {
        }
    }
}
