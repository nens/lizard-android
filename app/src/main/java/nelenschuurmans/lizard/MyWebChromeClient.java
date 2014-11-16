package nelenschuurmans.lizard;

import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;

public class MyWebChromeClient extends WebChromeClient {
    public void onPermissionRequest(PermissionRequest pr) {
        pr.grant(pr.getResources());
    }

    public void onGeolocationPermissionsShowPrompt(String origin,
                                                   GeolocationPermissions.Callback callback) {
        // Always grant permission since the app itself requires location
        // permission and the user has therefore already granted it
        callback.invoke(origin, true, false);
    }
}
