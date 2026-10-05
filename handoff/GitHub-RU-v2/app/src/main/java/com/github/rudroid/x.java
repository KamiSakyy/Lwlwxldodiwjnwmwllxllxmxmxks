package com.github.rudroid;

import android.net.Uri;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f20864a = sy.f0.r("tasks");

    public static final boolean a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        k71.k.f(pathSegments, "getPathSegments(...)");
        if ("copilot".equals(x61.m.W(pathSegments))) {
            return true;
        }
        List<String> pathSegments2 = uri.getPathSegments();
        k71.k.f(pathSegments2, "getPathSegments(...)");
        if ("copilot-chat".equals(x61.m.W(pathSegments2))) {
            return true;
        }
        List<String> pathSegments3 = uri.getPathSegments();
        k71.k.f(pathSegments3, "getPathSegments(...)");
        return "github-copilot".equals(x61.m.W(pathSegments3));
    }
}
