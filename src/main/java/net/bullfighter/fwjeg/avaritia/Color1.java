/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.bullfighter.fwjeg.avaritia as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.mcreator.avaritia_lp.util;

import net.minecraft.util.text.TextFormatting;

public class Color1 {
  private static final TextFormatting[] colour = new TextFormatting[] { 
      TextFormatting.RED, TextFormatting.GOLD, TextFormatting.YELLOW, TextFormatting.GREEN, TextFormatting.AQUA, TextFormatting.BLUE, TextFormatting.LIGHT_PURPLE, TextFormatting.DARK_AQUA, TextFormatting.DARK_BLUE, TextFormatting.DARK_GRAY, 
      TextFormatting.DARK_GREEN, TextFormatting.DARK_PURPLE, TextFormatting.DARK_RED };
  
  public static String formatting(String input, TextFormatting[] colours, double delay) {
    StringBuilder sb = new StringBuilder(input.length() * 3);
    if (delay <= 0.0D)
      delay = 0.001D; 
    int offset = (int)Math.floor((System.currentTimeMillis() & 0x3FFFL) / delay) % colours.length;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      sb.append(colours[(colours.length + i - offset) % colours.length].toString());
      sb.append(c);
    } 
    return sb.toString();
  }
  
  public static String zzssb(String input) {
    return formatting(input, colour, 80.0D);
  }
  
  public static String zzssb2(String input) {
    return formatting(input, colour, 59.5D);
  }
  
  public static String make(String input) {
    return formatting(input, colour, 23.5D);
  }
}
