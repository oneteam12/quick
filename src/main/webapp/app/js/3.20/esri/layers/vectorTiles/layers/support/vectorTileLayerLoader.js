// All material copyright ESRI, All Rights Reserved, unless otherwise specified.
// See http://js.arcgis.com/3.20/esri/copyright.txt for details.
//>>built
define("esri/layers/vectorTiles/layers/support/vectorTileLayerLoader","require exports dojo/has dojo/_base/lang ../../core/promiseUtils ../../core/urlUtils ../../config ../../request".split(" "),function(A,u,v,w,l,e,m,n){function k(a){if(a){var b=e.getOrigin(a);e.canUseXhr(b)||-1!==p.indexOf(b)||p.push(b);return a}}function q(a,b,c){if(null!=b.sources){c&&-1!==c.path.indexOf("root.json")&&(c.path=c.path.substr(0,c.path.indexOf("root.json")),a.styleUrl=c.path);var d=r(b,c),f=b.sprite,g=b.glyphs;d&&
d.url&&(d=c&&c.path?c.path:d.url,b.sprite&&!e.isAbsolute(b.sprite)&&(f=e.join(d,b.sprite)),b.glyphs&&!e.isAbsolute(b.glyphs)&&(g=e.join(d,b.glyphs)));a.style=b;a.spriteUrl=f;a.glyphsUrl=g;return x(a,b,c)}if(b.hasOwnProperty("tileInfo"))return a.layerDefinition=b,a.serviceUrl=c.path,y(a,b,c)}function y(a,b,c){if(z&&!b.hasOwnProperty("defaultStyles"))throw Error("Service definition must have 'defaultStyles' element!");b=b.defaultStyles;e.isAbsolute(b)?a.styleUrl=e.normalize(b):a.styleUrl=e.normalize(e.join(c.path,
b));k(a.styleUrl);return n(e.join(a.styleUrl,"root.json"),{responseType:"json"}).then(function(b){var c=b.data.sprite,d=b.data.glyphs;c&&!e.isAbsolute(c)&&(c=e.join(a.styleUrl,c));d&&!e.isAbsolute(d)&&(d=e.join(a.styleUrl,d));a.spriteUrl=c;a.glyphsUrl=d;return a.style=b.data})}function x(a,b,c){(b=r(b,c))||l.reject("Source isn't available in the syle object!");if(b.url)return a.serviceUrl=b.url,e.isAbsolute(a.serviceUrl)||(a.serviceUrl=e.join(c.path,a.serviceUrl)),k(a.serviceUrl),n(a.serviceUrl,{query:{f:"json"},
responseType:"json"}).then(function(b){a.layerDefinition=t(b.data);return a});a.layerDefinition=t(b);return l.resolve(a)}function r(a,b){if(!a.sources)return null;var c=a.sources,d=null;if(c.esri)d=c.esri,b&&d.url&&!e.isAbsolute(d.url)&&(c=b.path.substring(0,b.path.lastIndexOf("/")),d.url=e.join(c,d.url));else{for(var f=0,g=Object.keys(c);f<g.length;f++){var h=g[f];if(-1!==h.toLocaleLowerCase().indexOf("street")&&"vector"===d.type){d=c[h];break}}if(!d)for(f=0,g=Object.keys(c);f<g.length&&(h=g[f],
d=c[h],"vector"!==d.type);f++);}return d}function t(a){if(a.hasOwnProperty("tileInfo"))return a;for(var b={xmin:-2.0037507067161843E7,ymin:-2.0037507067161843E7,xmax:2.0037507067161843E7,ymax:2.0037507067161843E7,spatialReference:{wkid:102100}},c=(b.xmax-b.xmin)/512,d=[],e=a.hasOwnProperty("minzoom")?parseFloat(a.minzoom):0,g=a.hasOwnProperty("maxzoom")?parseFloat(a.maxzoom):16;e<g;e++){var h=c/Math.pow(2,e);d.push({level:e,scale:Math.floor(3779.527559055118*h),resolution:h})}a.tiles.forEach(k);return{capabilities:"TilesOnly",
initialExtent:b,fullExtent:b,minScale:d[0].scale,maxScale:d[d.length-1].scale,tiles:a.tiles,tileInfo:{rows:512,cols:512,dpi:96,format:"pbf",origin:{x:-2.0037508342787E7,y:2.0037508342787E7},lods:d,spatialReference:{wkid:102100}}}}var z=v("dojo-debug-messages"),p=m.defaults&&m.defaults.io.corsEnabledServers||m.request.corsEnabledServers;u.loadMetadata=function(a){if(!a)return l.reject("invalid input URL!");var b={layerDefinition:null,parsedUrl:null,serviceUrl:null,style:null,styleUrl:null,url:null,
spriteUrl:null,glyphsUrl:null};if("string"!==typeof a)return q(b,a,null).then(function(){return b});a=b.url=e.normalize(a);var c=b.parsedUrl=e.urlToObject(a);k(a);return n(c.path,{responseType:"json",query:w.mixin({f:"json"},c.query)}).then(function(a){return q(b,a.data,c)}).then(function(){return b})}});