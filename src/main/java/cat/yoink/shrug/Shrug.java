package cat.yoink.shrug;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.IClientCommand;

/**
 * @author Katatje
 * @since 16th July 2020
 */
public class Shrug extends CommandBase implements IClientCommand
{

    @Override
    public boolean allowUsageWithoutPrefix(ICommandSender sender, String message)
    {
        return false;
    }


    @Override
    public String getName()
    {
        return "shrug";
    }


    @Override
    public String getUsage(ICommandSender sender)
    {
        return "/shrug";
    }


    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args)
    {
        StringBuilder message = new StringBuilder();

        for (String s : args)
        {
            message.append(s).append(" ");
        }

        message.append(" \u00AF\\_(\u30C4)_/\u00AF");

        Minecraft.getMinecraft().player.sendChatMessage(message.toString());
    }

}
