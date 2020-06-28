# ModUpdater
A simple Minecraft mod updater.

Created For [ModFest 1.16](https://modfest.net/1.16)

**NOTE:** This is only able to scan mods that have opted-in!

## Mod Users
Go to the Mod Menu and click the configure icon for ModUpdater to view available updates.

## Mod Developers
Both ```fabric.mod.json``` and ```build.gradle``` must be modified to opt-in to ModUpdater.

### ```fabric.mod.json```
**Maven**
```json
{
    "custom": {
        "modupdater": {
            "strategy": "maven",
            "repository": "https://maven.fabricmc.net",
            "group": "net.fabricmc.fabric-api",
            "artifact": "fabric-api"
        }
    }
}
```

**CurseForge**
```json
{
    "custom": {
        "modupdater": {
            "strategy": "curseforge",
            "projectID": 306612
        }
    }
}
```

**GitHub Releases**
```json
{
    "custom": {
        "modupdater": {
            "strategy": "github",
            "owner": "Repository Owner",
            "repository": "Repository Name"
        }
    }
}
```

### ```build.gradle```
To properly detect the version of a file, the Minecraft version must be appended to the file name.

Replace:
```gradle
version = project.mod_version
```
with:
```gradle
version = "${project.mod_version}+${project.minecraft_version}"
```

If you prefer hyphens you can also use:
```gradle
version = "${project.mod_version}-${project.minecraft_version}"
```

You can also just use the major version of Minecraft instead of the full version (like ```1.16``` instead of ```1.16.1``` or ```20w20a```).

## Changelog
[View Changelog](CHANGELOG.md)

## Credits
- The icon was created by ``ProspectorDev``
- The GitHub Releases strategy was written by ``AppleTheGolden``