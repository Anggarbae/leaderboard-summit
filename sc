game.Players.PlayerAdded:Connect(function(player)
local leaderstats = Instance.new("Folder")
leaderstats.Name = "leaderstats"
leaderstats.Parent = player

local summitStat = Instance.new("IntValue")
summitStat.Name = "Summit"
summitStat.Parent = leaderstats
summitStat.Value = 0
end)
