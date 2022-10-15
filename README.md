# HomeAds

#config.json

```
   {
    "apps":

     [{
       "app_title": "App Name (Dialog)",
       "app_desc": "Your App's description",
       "app_icon": "https:// URL to Icon",
       "app_header_image": "https:// URL to Header Image",
       "app_uri": "http:// URL or Package Name - com.package.name",
       "app_rating": "4.5",
       "app_cta_text": "Install",
       "app_price": "Free",
       "app_adType": "dialog"
     },

     {
       "app_interstitial_url": "IMAGE URL",
       "app_uri": "http:// URL or Package Name - com.package.name",
       "app_adType": "interstitial"
     },
      
     {
     "app_title": "App Name 3 (Native Ad)",
     "app_desc": "Your App's Description",
     "app_icon": "https:// URL to Icon",
     "app_header_image": "https:// URL to Header Image",
     "app_uri": "http:// URL or Package Name - com.package.name",
     "app_rating": "4.5",
     "app_cta_text": "Install",
     "app_price": "Free",
     "app_adType": "native"
     }]
    }
```


```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ```
 
 ```
 dependencies {
	        implementation 'com.github.Thawtarlamin:HomeAds:1.0'
	}
```
```
id 'org.jetbrains.kotlin.android' version '1.6.10' apply false
```

```
apply plugin: 'kotlin-parcelize'
apply plugin: 'kotlin-android'
```

